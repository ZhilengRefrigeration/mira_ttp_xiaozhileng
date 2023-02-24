package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @aauthor 制冷
 * @date 2023/2/23 -- 19:18
 * @aversion 1.0
 * 读取问候词
 */
public class Get_text {
    public void Get() {

        //读取不要调戏的群
        try{
            File f=new File("data/dont_tiaoxi.txt");
            if(f.exists() && !f.isDirectory()) {
                Data.setDont_tiaoxi_group(Files.readAllLines(Paths.get("data/dont_tiaoxi.txt")).stream().flatMap(line -> Stream.of(line.split(","))).toArray(String[]::new));
            }
        }catch (IOException e){
            System.out.println("禁止调戏读取失败！");
        }

        //读取不要私聊的好友
        try{
            File f=new File("data/dont_siliao.txt");
            if(f.exists() && !f.isDirectory()) {
                Data.setDont_siliao(Files.readAllLines(Paths.get("data/dont_siliao.txt")).stream().flatMap(line -> Stream.of(line.split(","))).toArray(String[]::new));
            }
        }catch (IOException e){
            System.out.println("私聊读取失败！");
        }

        //读取不要问候的群
        try{
            File f=new File("data/dont_wenhou.txt");
            if(f.exists() && !f.isDirectory()) {
                Data.setDont_wenhou(Files.readAllLines(Paths.get("data/dont_wenhou.txt")).stream().flatMap(line -> Stream.of(line.split(","))).toArray(String[]::new));
            }
        }catch (IOException e){
            System.out.println("问候读取失败！");
        }

        //读取调戏文本
        try{
            File f=new File("data/tiaoxi.txt");
            if(f.exists() && !f.isDirectory()) {
                Data.setTiaoxis(Files.readAllLines(Paths.get("data/tiaoxi.txt")).stream().flatMap(line -> Stream.of(line.split(","))).toArray(String[]::new));
            }
        }catch (IOException e){
            System.out.println("调戏读取失败！");
        }

        //读取问候早文本
        try{
            File f=new File("data/wenhou_zao.txt");
            if(f.exists() && !f.isDirectory()) {
                Data.setWenhou_zao(Files.readAllLines(Paths.get("data/wenhou_zao.txt")).stream().flatMap(line -> Stream.of(line.split(","))).toArray(String[]::new));
            }
        }catch (IOException e){
            System.out.println("早问候文本读取失败！");
        }

        //读取问候晚文本
        try{
            File f=new File("data/wenhou_wan.txt");
            if(f.exists() && !f.isDirectory()) {
                Data.setWenhou_wan(Files.readAllLines(Paths.get("data/wenhou_wan.txt")).stream().flatMap(line -> Stream.of(line.split(","))).toArray(String[]::new));
            }
        }catch (IOException e){
            System.out.println("晚问候文本读取失败！");
        }

        //读取私聊文本
        try{
            File f=new File("data/siliao.txt");
            if(f.exists() && !f.isDirectory()) {
                Data.setSiliaos(Files.readAllLines(Paths.get("data/siliao.txt")).stream().flatMap(line -> Stream.of(line.split(","))).toArray(String[]::new));
            }
        }catch (IOException e){
            System.out.println("私聊文本读取失败！");
        }
        System.out.println("文本读取成功");
    }

}
