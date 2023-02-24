package com;

import javax.swing.*;
/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 15:34
 * @aversion 1.0
 * 更换sessionKey线程，每25分钟更换一次sessionKey
 */
public class Replacement_sessionKey extends Thread {
    @Override
    public void run() {
        while (true){
            //休眠25分钟
            try {
                Thread.sleep(1000*60*25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //更换sessionKey
            try {
                new Initialize().Main();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "无法更换sessionKey！！！");//提示错误
                System.exit(114514);
            }

        }
    }
}
