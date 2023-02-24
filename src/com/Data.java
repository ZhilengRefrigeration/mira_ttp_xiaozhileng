package com;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 14:03
 * @aversion 1.0
 * 数据类，保存各种数据
 */
public class Data {

    /******************【读取的配置文件】*********************/
    static String Url;//mirai-http服务器地址
    static String verifyKey;//mirai-http的verifyKey
    static String QQid;//机器人的QQ号
    static String MasterQQ;//机器人管理员的QQ号
    static String name;//机器人昵称
    static String wenhou_zao_time = "8:00";//早上问候时间
    static String wenhou_wan_time = "20:00";//晚上问候时间

    /******************【从mirai-http获取额数据】*********************/
    static String sessionkey;//获取到mirai-http的session key
    static String Message_size;//从Mirai-http获取到未读消息的长度

    /******************【其他数据】*********************/
    static String date = "9:00";
    static String date_tiaoxi = "11:20";

    /******************【插件开启数据】*********************/
    static String dingshiwenhou;
    static String tiaoxi;
    static String fwq;
    static String siliao;

    /******************【插件文本】*********************/
    static String wenhou_zao[];//早上问候的随机词
    static String wenhou_wan[];//晚上问候的随机词
    static String tiaoxis[];//调戏女群员的随机词
    static String siliaos[];//私聊的随机词
    static String dont_wenhou[];//不要问候的群
    static String dont_tiaoxi_group[];//不要调戏的群
    static String dont_siliao[];//不要私聊的好友


/******************【ToString方法】*********************/
   public String toString() {
    return "Data{" +
            "Url='" + Url + '\'' +
            ", verifyKey='" + verifyKey + '\'' +
            ", QQid='" + QQid + '\'' +
            ", MasterQQ='" + MasterQQ + '\'' +
            '}';
}

    public static String getUrl() {
        return Url;
    }

    public static void setUrl(String url) {
        Url = url;
    }

    public static String getVerifyKey() {
        return verifyKey;
    }

    public static void setVerifyKey(String verifyKey) {
        Data.verifyKey = verifyKey;
    }

    public static String getQQid() {
        return QQid;
    }

    public static void setQQid(String QQid) {
        Data.QQid = QQid;
    }

    public static String getMasterQQ() {
        return MasterQQ;
    }

    public static void setMasterQQ(String masterQQ) {
        MasterQQ = masterQQ;
    }

    public static String getSessionkey() {
        return sessionkey;
    }

    public static void setSessionkey(String sessionkey) {
        Data.sessionkey = sessionkey;
    }

    public static String getMessage_size() {
        return Message_size;
    }

    public static void setMessage_size(String message_size) {
        Message_size = message_size;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        Data.date = date;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Data.name = name;
    }

    public static String getDingshiwenhou() {
        return dingshiwenhou;
    }

    public static void setDingshiwenhou(String dingshiwenhou) {
        Data.dingshiwenhou = dingshiwenhou;
    }

    public static String getTiaoxi() {
        return tiaoxi;
    }

    public static void setTiaoxi(String tiaoxi) {
        Data.tiaoxi = tiaoxi;
    }

    public static String getFwq() {
        return fwq;
    }

    public static void setFwq(String fwq) {
        Data.fwq = fwq;
    }

    public static String getSiliao() {
        return siliao;
    }

    public static void setSiliao(String siliao) {
        Data.siliao = siliao;
    }

    public static String[] getWenhou_zao() {
        return wenhou_zao;
    }

    public static void setWenhou_zao(String[] wenhou_zao) {
        Data.wenhou_zao = wenhou_zao;
    }

    public static String[] getWenhou_wan() {
        return wenhou_wan;
    }

    public static void setWenhou_wan(String[] wenhou_wan) {
        Data.wenhou_wan = wenhou_wan;
    }

    public static String[] getTiaoxis() {
        return tiaoxis;
    }

    public static void setTiaoxis(String[] tiaoxis) {
        Data.tiaoxis = tiaoxis;
    }

    public static String[] getSiliaos() {
        return siliaos;
    }

    public static void setSiliaos(String[] siliaos) {
        Data.siliaos = siliaos;
    }

    public static String[] getDont_wenhou() {
        return dont_wenhou;
    }

    public static void setDont_wenhou(String[] dont_wenhou) {
        Data.dont_wenhou = dont_wenhou;
    }

    public static String[] getDont_tiaoxi_group() {
        return dont_tiaoxi_group;
    }

    public static void setDont_tiaoxi_group(String[] dont_tiaoxi_group) {
        Data.dont_tiaoxi_group = dont_tiaoxi_group;
    }

    public static String[] getDont_siliao() {
        return dont_siliao;
    }

    public static void setDont_siliao(String[] dont_siliao) {
        Data.dont_siliao = dont_siliao;
    }

    public static String getWenhou_zao_time() {
        return wenhou_zao_time;
    }

    public static void setWenhou_zao_time(String wenhou_zao_time) {
        Data.wenhou_zao_time = wenhou_zao_time;
    }

    public static String getWenhou_wan_time() {
        return wenhou_wan_time;
    }

    public static void setWenhou_wan_time(String wenhou_wan_time) {
        Data.wenhou_wan_time = wenhou_wan_time;
    }

    public static String getDate_tiaoxi() {
        return date_tiaoxi;
    }

    public static void setDate_tiaoxi(String date_tiaoxi) {
        Data.date_tiaoxi = date_tiaoxi;
    }
}
