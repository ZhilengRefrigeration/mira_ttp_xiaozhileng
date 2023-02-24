import com.*;
import com.function.*;
import com.google.gson.Gson;

import javax.swing.*;

/**
 * @aauthor 制冷1
 * @date 2023/2/19 -- 13:27
 * @aversion 1.0
 * 程序入口
 */
public class Main {
    public static void main(String[] args)throws Exception {
        //初始化程序
        Wenjian wenjian = new Wenjian();//文件处理对象
        Request request = new Request();//网络请对象
        Gson gson = new Gson();//处理Json的对象
        System.out.println("\033[33m" +
                "       　  　▃▆█▇▄▖\n" +
                "　 　 　 ▟◤▖　　　◥█▎\n" +
                "   　 ◢◤　 ▐　　　 　▐▉\n" +
                "　 ▗◤　　　▂　▗▖　　▕█▎\n" +
                "　◤　▗▅▖◥▄　▀◣　　█▊\n" +
                "▐　▕▎◥▖◣◤　　　　◢██\n" +
                "█◣　◥▅█▀　　　　▐██◤\n" +
                "▐█▙▂　　     　◢██◤\n" +
                "◥██◣　　　　◢▄◤\n" +
                " 　　▀██▅▇▀\n" +
                "哲学♂♂ 114514\n");
        //读取配置文件
        System.out.println("\033[32m" + "正在读取配置信息.......");

        wenjian.MAin();
        //判断配置文件有没有被修改
        if (Data.getQQid().equalsIgnoreCase("123456789")) {
            JOptionPane.showMessageDialog(null,"读取配置信息失败：您没有修改配置文件");//提示错误
            System.exit(114514);
        }
        System.out.println("\033[32m" + "配置文件读取成功，如有异常请将配置信息截图发送给开发者帮你排查问题" + "\n" + "您的配置信息：" + new Data().toString());

        //读取文本
        new Get_text().Get();
        System.out.println("====================================================================================");

        //初始化机器人
        new Initialize().Main();
        System.out.println("\033[32m" + "机器人初始化成功！开始处理消息");

        //启动更换sessionKey线程
        new Replacement_sessionKey().start();

        //启动定时问候功能
        if (Data.getDingshiwenhou().equalsIgnoreCase("true"))
            new Broadcast_regularly().start();

        //启动服务器性能监控功能
        if (Data.getFwq().equalsIgnoreCase("true"))
            new Service_monitoring().start();

        //启动定时私聊好友毒鸡汤
        if (Data.getSiliao().equalsIgnoreCase("true"))
            new Buddy_chicken_soup().start();

        //启动骚扰女群员
        if (Data.getTiaoxi().equalsIgnoreCase("true"))
            new Tease_female_group_member().start();


    }

}
