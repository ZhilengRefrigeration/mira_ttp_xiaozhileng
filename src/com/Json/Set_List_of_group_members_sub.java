package com.Json;

import java.time.format.SignStyle;
import java.util.Arrays;

/**
 * @aauthor 制冷
 * @date 2023/2/20 -- 20:35
 * @aversion 1.0
 * 保存群成员列表的对象数组
 */
public class Set_List_of_group_members_sub {
    public String id;
    public String memberName;
    public String specialTitle;
    public String permission;
    public String joinTimestamp;
    public String lastSpeakTimestamp;
    public String muteTimeRemaining;
    public Set_List_of_group_members_sub_sub group;

    public Set_List_of_group_members_sub(String id, String memberName, String specialTitle, String permission, String joinTimestamp, String lastSpeakTimestamp, String muteTimeRemaining, Set_List_of_group_members_sub_sub group) {
        this.id = id;
        this.memberName = memberName;
        this.specialTitle = specialTitle;
        this.permission = permission;
        this.joinTimestamp = joinTimestamp;
        this.lastSpeakTimestamp = lastSpeakTimestamp;
        this.muteTimeRemaining = muteTimeRemaining;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getSpecialTitle() {
        return specialTitle;
    }

    public void setSpecialTitle(String specialTitle) {
        this.specialTitle = specialTitle;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getJoinTimestamp() {
        return joinTimestamp;
    }

    public void setJoinTimestamp(String joinTimestamp) {
        this.joinTimestamp = joinTimestamp;
    }

    public String getLastSpeakTimestamp() {
        return lastSpeakTimestamp;
    }

    public void setLastSpeakTimestamp(String lastSpeakTimestamp) {
        this.lastSpeakTimestamp = lastSpeakTimestamp;
    }

    public String getMuteTimeRemaining() {
        return muteTimeRemaining;
    }

    public void setMuteTimeRemaining(String muteTimeRemaining) {
        this.muteTimeRemaining = muteTimeRemaining;
    }

    public Set_List_of_group_members_sub_sub getGroup() {
        return group;
    }

    public void setGroup(Set_List_of_group_members_sub_sub group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Set_List_of_group_members_sub{" +
                "id='" + id + '\'' +
                ", memberName='" + memberName + '\'' +
                ", specialTitle='" + specialTitle + '\'' +
                ", permission='" + permission + '\'' +
                ", joinTimestamp='" + joinTimestamp + '\'' +
                ", lastSpeakTimestamp='" + lastSpeakTimestamp + '\'' +
                ", muteTimeRemaining='" + muteTimeRemaining + '\'' +
                ", group=" + group +
                '}';
    }
}
