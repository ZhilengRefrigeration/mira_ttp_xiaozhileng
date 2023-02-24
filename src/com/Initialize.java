package com;

import com.Json.Get_bindQQ_json;
import com.Json.Get_session_json;
import com.Json.Set_bindQQ_json;
import com.Json.Set_session_json;
import com.google.gson.Gson;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 14:50
 * @aversion 1.0
 * 初始化miraihttp,即获取sessionkey，绑定sessionkey
 */
public class Initialize {
    public void Main() throws Exception {
        Request request = new Request();
        Gson gson = new Gson();
        Set_session_json set_session_json = null;//保存返回的session
        Get_session_json get_session_json = new Get_session_json(Data.verifyKey);//获取session

        //利用Get_session_json获取session，保存到Set_session_json

        try {
            set_session_json = gson.fromJson(request.Post(Data.Url + "/verify", gson.toJson(get_session_json)), Set_session_json.class);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "连接mirai-http错误，可能是配置文件设置错误或者mirai未启动");//提示错误
            System.exit(114514);
        }
        //判断是否获取成功
        if (set_session_json.code.equalsIgnoreCase("1")) {
            JOptionPane.showMessageDialog(null, "获取session错误，可能是配置文件中verifyKey设置错误");//提示错误
            System.exit(114514);
        }

        //将获取的session保存至数据类
        Data.sessionkey = set_session_json.session;

        //绑定session与机器人
        Get_bindQQ_json get_bindQQ_json = new Get_bindQQ_json(Data.sessionkey, Data.QQid);//提交绑定机器人
        Set_bindQQ_json set_bindQQ_json = null;//保存返回值
        set_bindQQ_json = gson.fromJson(request.Post(Data.Url + "/bind", gson.toJson(get_bindQQ_json)), Set_bindQQ_json.class);

        //判断是否绑定成功
        if (set_bindQQ_json.code.equalsIgnoreCase("0") == false) {
            JOptionPane.showMessageDialog(null, "绑定机器人错误，可能是配置文件机器人QQ设置错误");//提示错误
            System.exit(114514);
        }
    }
}
