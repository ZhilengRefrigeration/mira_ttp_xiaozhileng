package com.Json;

import java.util.Arrays;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 21:04
 * @aversion 1.0
 * 发送群消息艾特类
 */
public class Send_party_messages {
    public String sessionKey;
    public String target;
    public Send_party_messages_messageChain messageChain[];

    public Send_party_messages(String sessionKey, String target, Send_party_messages_messageChain[] messageChain) {
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

    public Send_party_messages_messageChain[] getMessageChain() {
        return messageChain;
    }

    public void setMessageChain(Send_party_messages_messageChain[] messageChain) {
        for(int i = 0;i < messageChain.length;i++)
        this.messageChain[i] = messageChain[i];
    }

    @Override
    public String toString() {
        return "Send_party_messages{" +
                "sessionKey='" + sessionKey + '\'' +
                ", target='" + target + '\'' +
                ", messageChain=" + Arrays.toString(messageChain) +
                '}';
    }
}
