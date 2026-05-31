import java.lang.reflect.Array;
import java.util.Arrays;

public class study16_String_method {
    public static void main(String[] args) {
        //实践场景1：解析CSV文件
        String line = "mouse,Logitech,USB";//字符串
        String[] parts = line.split(",");  // 按逗号拆分
        for(int i=0; i<parts.length; i++){
            //数组不是普通类--->Java底层特殊结构-->不用通过length()方法来获取长度
            //但是String和Arraylist是类

            System.out.println( "场景一："+"parts["  + i +  "] = " + parts[i]);

        }


        //实践场景2：提取设备名称
        String deviceInfo = "Mouse:Logitech";
        int index = deviceInfo.indexOf(":");//找到“：”的位置-->位置为5
        String name = deviceInfo.substring(0,index);
        //substring(开始位置，结束位置)-->含开始，但是不含结束
        //substring-->拆分前后两个部分
        // "Mouse"
        String brand = deviceInfo.substring(index+1);
        //index+1-->刚好可以不包括";",然后默认到结束

        System.out.println("实践场景2："+"第一个设备："+name+"第二个设备："+brand);


//实践场景3：清理字符串
        String line2 = "  mouse , Logitech , USB  ";
        String[] parts2 = line2.split(",");
        String[] parts3 =new String[parts2.length];
        for(int i=0; i<parts2.length; i++){
            parts3[i] = parts2[i].trim(); // 去掉空格
            //trim() 是必备操作，保证你 HashMap 的 key 不多出空格导致找不到
        }
       // System.out.println(parts2.toString()); 这样只会输出他的地址
        //输出数组的方法一：
        for(int i=0;i<parts3.length;i++){
            System.out.println("实践场景3.1："+parts3[i]);
        }
        for(int i=0;i<parts2.length;i++){
            System.out.println("实践场景3.2："+parts2[i]);
        }
        //输出数组的方法二：
        System.out.println("方法二的输出方式："+Arrays.toString(parts2));//利用java数组的工具类



//实践场景4：替换字符串内容
        String s="USB_Device";
        s=s.replace("_"," ");
        System.out.println("实践场景4："+s);

    }
}
//| 方法                                        | 功能           | 示例                                     |
//        | ----------------------------------------- | ------------ | -------------------------------------- |
//        | `length()`                                | 获取字符串长度      | `"abc".length() → 3`                   |
//        | `charAt(int index)`                       | 获取指定索引的字符    | `"abc".charAt(1) → 'b'`                |
//        | `substring(int beginIndex, int endIndex)` | 截取子串         | `"abcde".substring(1,4) → "bcd"`       |
//        | `indexOf(String str)`                     | 查找子串第一次出现的位置 | `"hello".indexOf("l") → 2`             |
//        | `lastIndexOf(String str)`                 | 查找子串最后出现的位置  | `"hello".lastIndexOf("l") → 3`         |
//        | `equals(String str)`                      | 判断内容是否相等     | `"abc".equals("abc") → true`           |
//        | `equalsIgnoreCase(String str)`            | 忽略大小写比较      | `"abc".equalsIgnoreCase("ABC") → true` |
//        | `trim()`                                  | 去掉首尾空格       | `" abc ".trim() → "abc"`               |
//        | `replace(String old, String new)`         | 替换子串         | `"abcabc".replace("a","x") → "xbcxbc"` |
//        | `split(String regex)`                     | 按正则拆分        | `"a,b,c".split(",") → ["a","b","c"]`   |
//        | `toLowerCase()` / `toUpperCase()`         | 转大小写         | `"AbC".toLowerCase() → "abc"`          |

