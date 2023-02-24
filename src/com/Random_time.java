package com;
import java.util.Calendar;
import java.util.Random;
/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 14:19
 * @aversion 1.0
 * 每天三点生成调戏女成员插件和随机给好友发送毒鸡汤插件需要的时间
 */
public class Random_time extends Thread{
    Random r = new Random();
    @Override
    public void run() {
        while (true){
                    Calendar cal = Calendar.getInstance();
                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    int minute = cal.get(Calendar.MINUTE);
                    if(hour == 3 && minute == 1){
                        int i1 = r.nextInt(16)+6;
                        int i2 = r.nextInt(16)+6;
                        Data.setDate(i1+":"+i2);
                        i1 = r.nextInt(16)+6;
                        i2 = r.nextInt(16)+6;
                        Data.setDate_tiaoxi(i1+":"+i2);

                    }

                }
            }

        }


