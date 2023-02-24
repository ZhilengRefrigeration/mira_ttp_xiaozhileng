package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 14:54
 * @aversion 1.0
 * 接收返回的session
 */
public class Set_session_json {
    public String code;
    public String session;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Set_session_json{" +
                "code='" + code + '\'' +
                ", session='" + session + '\'' +
                '}';
    }
}
