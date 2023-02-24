package com.Json;

import java.util.Arrays;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 20:24
 * @aversion 1.0
 * 保存获取的群列表
 */
public class Set_List_of_groups {
    public String code;
    public String msg;
    public Set_List_of_groups_sub data[];

    public Set_List_of_groups(String code, String msg, Set_List_of_groups_sub[] data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

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

    public Set_List_of_groups_sub[] getData() {
        return data;
    }

    public void setData(Set_List_of_groups_sub[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Set_List_of_groups{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
