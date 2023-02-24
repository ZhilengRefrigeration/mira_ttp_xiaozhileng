package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 15:16
 * @aversion 1.0
 * 保存绑定机器人的返回值
 */
public class Set_bindQQ_json {
public String code;
public String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Set_bindQQ_json{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
