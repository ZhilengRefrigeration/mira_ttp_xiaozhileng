package com.Json;

import java.util.Arrays;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 13:44
 * @aversion 1.0
 * 提交该类修改群成员信息
 */
public class Get_Modify_the_group_business_card {
    public String sessionKey;//机器人的sessionKey
    public String target;//指定群的群号
    public String memberId;//指定群成员ID
    public Get_Modify_the_group_business_card_sub info;

    public Get_Modify_the_group_business_card(String sessionKey, String target, String memberId, Get_Modify_the_group_business_card_sub info) {
        this.sessionKey = sessionKey;
        this.target = target;
        this.memberId = memberId;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Get_Modify_the_group_business_card{" +
                "sessionKey='" + sessionKey + '\'' +
                ", target='" + target + '\'' +
                ", memberId='" + memberId + '\'' +
                ", info=" + info +
                '}';
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Get_Modify_the_group_business_card_sub getInfo() {
        return info;
    }

    public void setInfo(Get_Modify_the_group_business_card_sub info) {
        this.info = info;
    }
}
