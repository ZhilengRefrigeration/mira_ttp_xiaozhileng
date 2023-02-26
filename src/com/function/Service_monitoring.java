package com.function;

import com.Data;
import com.Json.Get_Modify_the_group_business_card;
import com.Json.Get_Modify_the_group_business_card_sub;
import com.Json.Set_List_groups_json;
import com.Request;
import com.google.gson.Gson;
import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 13:25
 * @aversion 1.0
 * 服务器监控功能，将服务器状态打到机器人群名片上
 */
public class Service_monitoring extends Thread{
    private static OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
    Request request = new Request();//post和get请求
    Set_List_groups_json set_list_groups_json ;//群内容
    Gson gson = new Gson();
    @Override
    public void run() {
        while(true){

            //获取群列表
            try {
                set_list_groups_json = gson.fromJson(request.Get(Data.getUrl() + "/groupList?sessionKey=" + Data.getSessionkey()),Set_List_groups_json.class);
            } catch (Exception exception) {
                System.out.println("获取群列表失败！！！");
            }

            //获取服务器信息

            //获取CPU
            double cpuLoad = osmxb.getSystemCpuLoad();
            int percentCpuLoad = (int) (cpuLoad * 100);
            //获取内存
            double totalvirtualMemory = osmxb.getTotalPhysicalMemorySize();
            double freePhysicalMemorySize = osmxb.getFreePhysicalMemorySize();
            double value = freePhysicalMemorySize/totalvirtualMemory;
            int percentMemoryLoad = (int) ((1-value)*100);


            for(int i = 0;i < set_list_groups_json.data.length;i ++){
            //创建要提交的群名片信息
            Get_Modify_the_group_business_card get_modify_the_group_business_card = new Get_Modify_the_group_business_card(Data.getSessionkey(),set_list_groups_json.data[i].id,"1334935554",new Get_Modify_the_group_business_card_sub( Data.getName()+ "|cpu:" + percentCpuLoad + "%" + "|" + "内存:" + percentMemoryLoad + "%","小制冷"));

            //将数据提交到所有群名片
                try {
                  request.Post(Data.getUrl() + "/memberInfo",gson.toJson(get_modify_the_group_business_card));
                } catch (Exception exception) {
                    System.out.println("修改群名片错误！！！");
                }
            }

            //休眠五秒
            try {
                Thread.sleep(1000*60*5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
