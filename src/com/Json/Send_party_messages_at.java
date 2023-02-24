package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/21 -- 21:31
 * @aversion 1.0
 * Send_party_messages艾特数组
 */
public class Send_party_messages_at {
    public String type ;
    public String target;
    public String display;

    public Send_party_messages_at(String type, String target, String display) {
        this.type = type;
        this.target = target;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Send_party_messages_at{" +
                "type='" + type + '\'' +
                ", target='" + target + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
