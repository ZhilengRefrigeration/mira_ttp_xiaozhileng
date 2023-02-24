package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 21:08
 * @aversion 1.0
 * Send_party_messages的数组类
 */
public class Send_party_messages_messageChain {
    public String type;
    public String text;

    public Send_party_messages_messageChain(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Send_party_messages_messageChain{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
