package com.function;

import com.Data;
import com.Json.*;
import com.Request;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 14:15
 * @aversion 1.0
 * 调戏女群员，每天随机一个时间点艾特随机群聊女成员说奇怪的话
 */
public class Tease_female_group_member extends Thread{
    int leng = 0;
    List list;
    List<Integer> lists;
    Set_QQInformation set_qqInformation;
    Set_List_of_group_members set_list_of_group_members;
    String date;
    Request request = new Request();
    Set_List_of_groups set_list_of_groups;
    Random r = new Random();
    boolean b =false;
    String text[];
    String group[];
    @Override
    public void run() {

        Gson gson = new Gson();
        while (true){
           this. date = Data.getDate();

            //读取时间
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);

            //判断时间有没有凌晨三点
            if (hour==3&&minute==30){
                date = Data.getDate();
            }

            //判断时间有没有到
            if((hour + ":" + minute).equalsIgnoreCase(Data.getDate_tiaoxi())){
                //取出所有群列表
                try {
                    set_list_of_groups =gson.fromJson(request.Get(Data.getUrl()+ "/groupList?sessionKey=" + Data.getSessionkey()),Set_List_of_groups.class);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                //重置随机群聊
                lists = new ArrayList<Integer>();

                //随机取出一个群聊的群聊
                for(int i = 0; i < set_list_of_groups.data.length; i ++){

                    //防止重复
                    int i1 = r.nextInt(set_list_of_groups.data.length);
                    boolean b = false;
                    for(int nub = 0; nub < lists.size();nub++){
                        if(lists.get(nub).equals(i1)){
                            b = true;
                            break;
                        }
                    }
                    if(b){
                        --i;
                        continue;
                    }
                    lists.add(i1);

                    /**这里需要添加一个循环，用于判断不需要的群*/
                    if(Data.getDont_tiaoxi_group().length != 0){
                         group = Data.getDont_tiaoxi_group();
                        for(int dot = 0;dot < group.length;dot ++)
                            if(group[dot].equalsIgnoreCase(set_list_of_groups.data[i1].id))
                                b =true;
                    }
                    if(b)continue;

                    //重置QQ号列表
                    list = new ArrayList();


                    try {
                        Thread.sleep(1000*5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    //取出第i1个群聊的群成员
                    try {
                        set_list_of_group_members = gson.fromJson(request.Get(Data.getUrl()+"/memberList?sessionKey=" + Data.getSessionkey()+"&target="+set_list_of_groups.data[i1].id),Set_List_of_group_members.class);
                    } catch (Exception exception) {
                        System.out.println("获取群成员异常");
                    }

                    //依次判断群成员性别，保存到集合中
                    System.out.println("开始处理群聊： "+set_list_of_groups.data[i1].name);
                    for(int j =  0; j < set_list_of_group_members.data.length; j++){
                        try {
                            set_qqInformation = gson.fromJson(request.Get(Data.getUrl()+"/userProfile?sessionKey="+Data.getSessionkey()+"&target=" + set_list_of_group_members.data[j].id),Set_QQInformation.class);
                            Thread.sleep(500);
                        } catch (Exception exception) {
                            System.out.println("获取群友信息异常！！！");
                        }
                        if(set_qqInformation.getSex().equalsIgnoreCase("FEMALE")&& !(set_qqInformation.getNickname().equalsIgnoreCase(""))){
                            list.add(set_list_of_group_members.data[j].id);
                            System.out.println("在随机库中加入了女群员： "+set_qqInformation.getNickname()+"---"+set_list_of_group_members.data[j].getId());
                            ++leng;
                        }
                    }

                    //如果没有女生就下一个
                    if(list.size() == 0){
                        System.out.println("该群没有女群员");
                        --i;
                        continue;
                    }

                    //随机从集合取出一个女生
                    int i2 = 0;
                    while (true){
                     i2 = r.nextInt(list.size());
                    if(list.size() == 1 ){i2 = 0; break;}
                    else break;
                    }

                    //随机取出文本
                    if(Data.getTiaoxis().length > 0){
                        text = Data.getTiaoxis();
                        text[0] = text[r.nextInt(text.length)];
                    }else{
                        text = new String[]{"哎！我的憨憨主人没有在data文件夹写入文本，你可以告诉他一声吗！！！"};
                    }

                    //艾特她说奇怪的话
                    System.out.println("即将在群聊: "+set_list_of_groups.data[i1].name+"中艾特"+"\n"+ list.get(i2));
                    Send_party_messagesat send_party_messagesat = new Send_party_messagesat(Data.getSessionkey(),set_list_of_groups.data[i1].id,new Send_party_messages_at[1]);
                    send_party_messagesat.messageChain[0] = new Send_party_messages_at("At",(String) list.get(i2),"@Mirai");
                    Send_party_messages send_party_messages  = new Send_party_messages(Data.getSessionkey(),set_list_of_groups.data[i1].id,new Send_party_messages_messageChain[1]);
                    send_party_messages.messageChain[0] = new Send_party_messages_messageChain("Plain",text [0]);
                    try {
                        request.Post(Data.getUrl() + "/sendGroupMessage",gson.toJson(send_party_messagesat));
                        request.Post(Data.getUrl() + "/sendGroupMessage",gson.toJson(send_party_messages));
                        System.out.println("执行成功，即将执行下一个群");
                        System.out.println("========================");
                    } catch (Exception exception) {
                        System.out.println("发送消息失败");
                    }
                }
                System.out.println("消息处理完啦！！！第二天再说吧");
                try {
                    Thread.sleep(1000*10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
            try {
                Thread.sleep((1000*30)+1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
}
