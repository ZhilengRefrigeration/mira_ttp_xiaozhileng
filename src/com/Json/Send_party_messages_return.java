package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 21:12
 * @aversion 1.0
 */
public class Send_party_messages_return {
    public String code;
    public String msg;
    public String messageId;

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

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "Send_party_messages_return{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", messageId='" + messageId + '\'' +
                '}';
    }
}
