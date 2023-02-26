package com.function;

import com.Data;
import com.Json.Get_Friend_messages;
import com.Json.Get_Friend_messages_sub;
import com.Json.Set_Buddy_table;
import com.Request;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
/**
 * @aauthor Dengsengxian
 * @date 2023/2/20 -- 13:25
 * @aversion 1.0
 * 私聊
 */
public class Buddy_chicken_soup extends Thread {
    List<Integer> list;
    Request request  = new Request();
    Random r = new Random();
    Set_Buddy_table set_buddy_table;
    public String date;
    boolean b =false;
    String text[];
    @Override
    public void run() {
        Gson gson = new Gson();
        while (true){
            date = Data.getDate();
            //读取时间
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);

            //判断时间有没有凌晨三点
            if (hour==3&&minute==30){
                    date = Data.getDate();
            }

            //判断时间有没有到读取的随机时间
            String str = hour+":"+minute;
            if (str.equalsIgnoreCase(Data.getDate())){
                try {
                   set_buddy_table = gson.fromJson(request.Get( Data.getUrl()+"/friendList?sessionKey="+Data.getSessionkey()),Set_Buddy_table.class);
                } catch (Exception e) {
                    e.printStackTrace();

                }

                //重置随机好友
                list = new  ArrayList<Integer>();

                //随机获取好友列表的一半人数
                for (int i = 0; i < set_buddy_table.data.length/2; i++) {

                    //判断有没有重复
                    int i1 = r.nextInt(set_buddy_table.data.length);
                    boolean b  = false;
                    for (int j = 0; j < list.size(); j++) {
                        Integer integer =  list.get(j);
                        if(list.size() ==0)break;
                        if(integer == i1) b = true;

                    }
                    if(b){i--;continue;}
                    list.add(i1);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    /**这里需要添加一个循环，用于判断不需要的好友*/
                    if(Data.getDont_siliao().length != 0){
                        String Friend[] = Data.getDont_siliao();
                        for(int dot = 0;dot < Friend.length;dot++)
                            if(set_buddy_table.data[i1].id.equalsIgnoreCase(Friend[dot]))
                                b = true;
                    }
                    if(b)continue;



                        //随机抽取消息
                    if(Data.getSiliao().length() > 0) {
                        text = Data.getSiliaos();
                        text[0] = text[r.nextInt(text.length)];
                    }else{
                        text = new String[]{"哎！我的憨憨主人没有在data文件夹写入文本，你可以告诉他一声吗！！！"};
                    }




                    //创建消息
                    Get_Friend_messages get_friend_messages = new Get_Friend_messages(Data.getSessionkey(),set_buddy_table.data[i1].id, new Get_Friend_messages_sub[1]);
                    try {
                        get_friend_messages.messageChain[0] = new Get_Friend_messages_sub("Plain",text[0]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    //发送消息
                        try {
                            request.Post(Data.getUrl() + "/sendFriendMessage", gson.toJson(get_friend_messages));
                            System.out.println("消息已发送"+get_friend_messages.messageChain[0].text+get_friend_messages.target);
                        } catch (Exception e) {
                            System.out.println("发送消息异常");
                        }
                }System.out.println("消息处理完啦！！！第二天再说吧");
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
