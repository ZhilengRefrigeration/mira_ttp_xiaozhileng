package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 18:00
 * @aversion 1.0
 * Set_List_groups_json的集合子类
 */
public class Set_List_groups_json_sub {
    public String id;
    public String name;
    public String permission;

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
        return "Set_List_groups_json_sub{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
