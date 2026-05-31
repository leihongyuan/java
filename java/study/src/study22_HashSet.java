import java.util.HashMap;
import java.util.HashSet;

public class study22_HashSet {
    public static void main(String[] args) {
        //特点1：不允许重复
        //特点2：无顺序
        //特点3：底层基于HashMap
        HashSet<String> set=new HashSet<>();
        set.add("mouse");
        set.add("keyboard");
        set.add("mouse");
        System.out.println(set);//HashSet会自动去重
        System.out.println(set.contains("mouse"));//判断是否存在
        for(String s:set){
            System.out.println(s);

        }
    }
}
//| 特性   | ArrayList | HashSet |
//| ---- | --------- | ------- |
//| 重复元素 | 允许        | 不允许     |
//| 顺序   | 有序        | 无序      |
//| 索引   | 有         | 没有      |
//| 底层   | 动态数组      | HashMap |
