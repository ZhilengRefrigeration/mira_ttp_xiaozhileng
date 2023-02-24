package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 15:16
 * @aversion 1.0
 * 提交绑定机器人的json
 */
public class Get_bindQQ_json {
    public String sessionKey;
    public String qq;

    public Get_bindQQ_json(String sessionKey, String qq) {
        this.sessionKey = sessionKey;
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "Get_bindQQ_json{" +
                "sessionKey='" + sessionKey + '\'' +
                ", qq='" + qq + '\'' +
                '}';
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
