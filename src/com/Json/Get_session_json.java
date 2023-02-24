package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 14:52
 * @aversion 1.0
 * 获取session的json
 */
public class Get_session_json {
    public String verifyKey;

    public Get_session_json(String verifyKey) {/**构造方法方便传入verifyKey*/
        this.verifyKey = verifyKey;
    }

    public String getVerifyKey() {
        return verifyKey;
    }

    public void setVerifyKey(String verifyKey) {
        this.verifyKey = verifyKey;
    }

    @Override
    public String toString() {
        return "Get_session_json{" +
                "verifyKey='" + verifyKey + '\'' +
                '}';
    }
}
