package com.Json;

public class Set_Buddy_table_sub {
public String id;
public String nickname;
public String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Set_Buddy_table_sub{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
