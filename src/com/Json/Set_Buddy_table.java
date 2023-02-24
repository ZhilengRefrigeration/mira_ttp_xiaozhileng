package com.Json;

import java.util.Arrays;

//保存Mirai-http返回的好友列表
public class Set_Buddy_table {
    public String code;
    public String msg;
   public Set_Buddy_table_sub data[];

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

    public Set_Buddy_table_sub[] getData() {
        return data;
    }

    public void setData(Set_Buddy_table_sub[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Set_Buddy_table{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
