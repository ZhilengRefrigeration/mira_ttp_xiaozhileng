package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 20:39
 * @aversion 1.0
 * 保存群成员列表的对象数组
 */
public class Set_List_of_group_members_sub_sub {
    public String id;
    public String name;
    public String permission;

    public Set_List_of_group_members_sub_sub(String id, String name, String permission) {
        this.id = id;
        this.name = name;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Set_List_of_group_members_sub_sub{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
