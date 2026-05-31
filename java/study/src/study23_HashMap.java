import java.util.HashMap;
import java.util.HashSet;

public class study23_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //表示：key为String类型，value为Integer类型
        //HashMap为无序的可能输出的顺序不同

        //添加数据
        map.put("Tom",42);
        map.put("leihongyuan",100);
        map.put("Alice",85);

        //修改数据-->在hashmap中key不允许重复，所以看最新的那一个
        map.put("Tom",55);

        //删除数据
        map.remove("Alice");

        System.out.println(map);
        //查找-->利用Hash-->查找的较快
        System.out.println(map.get("Tom"));
        //查看key是否存在
        System.out.println(map.containsKey("leihongyuan"));
        //查看value是否存在
        System.out.println(map.containsValue(100));

        //遍历
        for (String key:map.keySet()){//keySet()为key的集合
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}
