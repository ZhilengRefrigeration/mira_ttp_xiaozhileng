package com.Json;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 13:45
 * @aversion 1.0
 * 修改群名片的子类
 */
public class Get_Modify_the_group_business_card_sub {
    public String name;//群名片
    public String specialTitle;//群头衔

    public Get_Modify_the_group_business_card_sub(String name, String specialTitle) {
        this.name = name;
        this.specialTitle = specialTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialTitle() {
        return specialTitle;
    }

    public void setSpecialTitle(String specialTitle) {
        this.specialTitle = specialTitle;
    }

    @Override
    public String toString() {
        return "Get_Modify_the_group_business_card_sub{" +
                "name='" + name + '\'' +
                ", specialTitle='" + specialTitle + '\'' +
                '}';
    }
}
