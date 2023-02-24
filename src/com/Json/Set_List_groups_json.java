package com.Json;

import java.util.Arrays;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 17:57
 * @aversion 1.0
 * 保存获取的群聊列表
 */
public class Set_List_groups_json {
    public String code;
    public String msg;
   public Set_List_groups_json_sub  data[];

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

    public Set_List_groups_json_sub[] getData() {
        return data;
    }

    public void setData(Set_List_groups_json_sub[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Set_List_groups_json{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
