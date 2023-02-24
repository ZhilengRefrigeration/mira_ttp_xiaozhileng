package com.Json;

import java.util.Arrays;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 20:34
 * @aversion 1.0
 * 保存群成员列表
 */
public class Set_List_of_group_members {
    public String code;
    public String msg;
    public Set_List_of_group_members_sub data[];

    public Set_List_of_group_members(String code, String msg, Set_List_of_group_members_sub[] data) {
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

    public Set_List_of_group_members_sub[] getData() {
        return data;
    }

    public void setData(Set_List_of_group_members_sub[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Set_List_of_group_members{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
