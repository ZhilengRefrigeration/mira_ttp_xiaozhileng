package com.Json;

import com.google.gson.Gson;
//发送消息的Json
import java.security.PublicKey;
import java.util.Arrays;

public class Get_Friend_messages {
    public String sessionKey;
    public String target;
   public   Get_Friend_messages_sub messageChain[];

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

    public Get_Friend_messages_sub[] getMessageChain() {
        return messageChain;
    }

    public void setMessageChain(Get_Friend_messages_sub[] messageChain) {
        this.messageChain = messageChain;
    }

    @Override
    public String toString() {
        return "Get_Friend_messages{" +
                "sessionKey='" + sessionKey + '\'' +
                ", target='" + target + '\'' +
                ", messageChain=" + Arrays.toString(messageChain) +
                '}';
    }

    public Get_Friend_messages(String sessionKey, String target, Get_Friend_messages_sub[] messageChain) {
        this.sessionKey = sessionKey;
        this.target = target;
        this.messageChain = messageChain;
    }
}
