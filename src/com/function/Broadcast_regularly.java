package com.function;
import com.Data;
import com.Json.Send_party_messages;
import com.Json.Send_party_messages_messageChain;
import com.Json.Send_party_messages_return;
import com.Json.Set_List_groups_json;
import com.Request;
import com.google.gson.Gson;

import java.util.Calendar;
import java.util.Random;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 15:45
 * @aversion 1.0
 * 定时播报功能，用于早上和晚上定时提醒
 */
public class Broadcast_regularly extends Thread{
    Random r = new Random();
    Request request = new Request();
    Set_List_groups_json set_list_groups_json ;
    Gson gson = new Gson();
    boolean b = false;
    String text[];
    @Override
    public void run() {
        //每三十五秒获取一次时间
       while(true){
           try {
               Thread.sleep(1000*30+1);
           } catch (InterruptedException e) {
               System.out.println("获取时间错误！！！");
           }
           Calendar cal = Calendar.getInstance();
           int hour = cal.get(Calendar.HOUR_OF_DAY);
           int minute = cal.get(Calendar.MINUTE);
           //判断到没到早安时间
           if((hour + ":" + minute).equalsIgnoreCase(Data.getWenhou_zao_time())){

               //获取群列表
               try {
                   set_list_groups_json = gson.fromJson(request.Get(Data.getUrl() + "/groupList?sessionKey=" + Data.getSessionkey()),Set_List_groups_json.class);
               } catch (Exception exception) {
                   System.out.println("获取群列表失败！！！");
               }

               //依次发送信息
               for(int i = 0;i < set_list_groups_json.data.length;i ++)
               {

                   /**这里需要添加一个循环，用于判断不需要的群*/
                   if(Data.getDont_wenhou().length != 0) {
                       String gruop[] = Data.getDont_wenhou();
                       for (int dot = 0; dot < gruop.length; dot++)
                           if (gruop[dot].equalsIgnoreCase(set_list_groups_json.data[i].id))
                               b =true;

                   }
                   if(b)continue;

                   try {
                       Thread.sleep(1000*2);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

                   //随机抽取消息
                   if(Data.getWenhou_zao().length > 0){
                          text = Data.getWenhou_zao();
                          text[0] =  text[r.nextInt(text.length)];
                   }
                       else {
                           text = new String[]{"哎!!"};
                       }
                       //
                    Send_party_messages send_party_messages = new Send_party_messages(Data.getSessionkey(),set_list_groups_json.data[i].id,new Send_party_messages_messageChain[1]);
                    Send_party_messages_messageChain send_party_messages_messageChain;
                    send_party_messages_messageChain = new Send_party_messages_messageChain("Plain",text[0]);
                    send_party_messages.messageChain[0] = send_party_messages_messageChain;
                   try {
                       System.out.println("向：" + set_list_groups_json.data[i].name+" 发送："+text[0]) ;
                       request.Post(Data.getUrl() + "/sendGroupMessage",gson.toJson(send_party_messages));
                   } catch (Exception exception) {
                       exception.printStackTrace();
                   }
               }
             }
           /**晚上发消息功能*/

           //判断到没到晚安时间
           if((hour + ":" + minute).equalsIgnoreCase(Data.getWenhou_wan_time())){

               //获取群列表
               try {
                   set_list_groups_json = gson.fromJson(request.Get(Data.getUrl() + "/groupList?sessionKey=" + Data.getSessionkey()),Set_List_groups_json.class);
               } catch (Exception exception) {
                   System.out.println("获取群列表失败！！！");
               }

               //依次发送信息
               for(int i = 0;i < set_list_groups_json.data.length;i ++){

                   /**这里需要添加一个循环，用于判断不需要的群*/
                   if(Data.getDont_wenhou().length != 0) {
                       String gruop[] = Data.getDont_wenhou();
                       for (int dot = 0; dot < gruop.length; dot++) {
                           if (gruop[dot].equalsIgnoreCase(set_list_groups_json.data[i].id))
                               b =true;
                       }
                   }
                   if(b)continue;

                   try {
                       Thread.sleep(1000*2);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

                   //随机抽取消息
                   if(Data.getWenhou_wan().length > 0){
                       text = Data.getWenhou_wan();
                       text[0] =  text[r.nextInt(text.length)];
                   }
                   else {
                       text = new String[]{"哎！我的憨憨主人没有在data文件夹写入文本，你可以告诉他一声吗！！！"};
                   }

                   Send_party_messages send_party_messages = new Send_party_messages(Data.getSessionkey(),set_list_groups_json.data[i].id,new Send_party_messages_messageChain[1]);
                   Send_party_messages_messageChain send_party_messages_messageChain;
                   send_party_messages_messageChain = new Send_party_messages_messageChain("Plain",text[0]);
                   send_party_messages.messageChain[0] = send_party_messages_messageChain;
                   try {
                       System.out.println("向：" + set_list_groups_json.data[i].name+" 发送："+text[0]) ;
                       request.Post(Data.getUrl() + "/sendGroupMessage",gson.toJson(send_party_messages));
                   } catch (Exception exception) {
                       exception.printStackTrace();
                   }
               }
           }
           }
       }

    }

