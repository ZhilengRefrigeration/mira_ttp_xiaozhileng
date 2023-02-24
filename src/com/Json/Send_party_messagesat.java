package com.Json;

import java.util.Arrays;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 21:04
 * @aversion 1.0
 * 发送群消息艾特类
 */
public class Send_party_messagesat {
    public String sessionKey;
    public String target;
    public Send_party_messages_at messageChain[];

    public Send_party_messagesat(String sessionKey, String target, Send_party_messages_at[] messageChain) {
        this.sessionKey = sessionKey;
        this.target = target;
        this.messageChain = messageChain;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Send_party_messages_at[] getMessageChain() {
        return messageChain;
    }

    public void setMessageChain(Send_party_messages_at[] messageChain) {
        this.messageChain = messageChain;
    }

    @Override
    public String toString() {
        return "Send_party_messagesat{" +
                "sessionKey='" + sessionKey + '\'' +
                ", target='" + target + '\'' +
                ", messageChain=" + Arrays.toString(messageChain) +
                '}';
    }
}
