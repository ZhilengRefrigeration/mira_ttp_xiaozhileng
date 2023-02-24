package com;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @aauthor 制冷
 * @date 2023/2/19 -- 14:00
 * @aversion 1.0
 * 读取配置信息
 */
public class Wenjian {
    /***********【该方法用于判断配置文件是否存在，如果存在则读取，不存在则创建】*************/
    public void MAin() throws IOException {
        File file = new File("data/config.yml");
        if (file.exists() == false) {
            Map<String, Object> map = new HashMap<>();
            map.put("ip", "127.0.0.1");
            map.put("port", "8080");
            map.put("QQID","123456789");
            map.put("verifyKey","1234567890");
            map.put("masterID","123456789");
            map.put("dingshiwenhou","true");
            map.put("siliao","true");
            map.put("tiaoxi","true");
            map.put("fwq","true");
            map.put("name","小制冷");
            map.put("wenhou_zao_time","8:30");
            map.put("wenhou_wan_time","20:30");

            Yaml yml = new Yaml();
            FileWriter writer = new FileWriter("data/config.yml", true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.newLine();
            yml.dump(map, buffer);
            buffer.close();
            writer.close();
        }
        Yaml yml = new Yaml();
        FileReader reader = new FileReader("data/config.yml");
        BufferedReader buffer = new BufferedReader(reader);
        Map<String,Object> map = (Map<String, Object>) yml.load(buffer);
        Data.Url = "http://" +  (String) map.get("ip") + ":" + (String)map.get("port");
        Data.QQid = (String) map.get("QQID");
        Data.verifyKey = (String) map.get("verifyKey");
        Data.MasterQQ = (String) map.get("masterID");
        Data.setSiliao((String) map.get("siliao"));
        Data.setDingshiwenhou((String) map.get("dingshiwenhou"));
        Data.setTiaoxi((String) map.get("tiaoxi"));
        Data.setFwq((String) map.get("fwq"));
        Data.setName((String) map.get("name"));
        Data.setWenhou_wan_time((String) map.get("wenhou_zao_time"));
        Data.setWenhou_zao_time((String) map.get("wenhou_wan_time"));
        buffer.close();
        reader.close();
    }
}
