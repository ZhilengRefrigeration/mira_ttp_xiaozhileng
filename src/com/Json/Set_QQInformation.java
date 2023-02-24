package com.Json;

import java.time.format.SignStyle;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 21:04
 * @aversion 1.0
 * 保存查询QQ好友信息
 */
public class Set_QQInformation {
    public String nickname;
    public String email;
    public String age;
    public String level;
    public String sign;
    public String sex;

    public Set_QQInformation(String nickname, String email, String age, String level, String sign, String sex) {
        this.nickname = nickname;
        this.email = email;
        this.age = age;
        this.level = level;
        this.sign = sign;
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Set_QQInformation{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                ", level='" + level + '\'' +
                ", sign='" + sign + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
