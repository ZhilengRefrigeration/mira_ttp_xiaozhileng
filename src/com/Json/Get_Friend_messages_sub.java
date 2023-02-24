package com.Json;
//发送好友消息请求的Json中的对象数组
public class Get_Friend_messages_sub {
 public  String type;
 public  String text;

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
        return "Get_Friend_messages{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public Get_Friend_messages_sub(String type, String text) {
        this.type = type;
        this.text = text;
    }
}
