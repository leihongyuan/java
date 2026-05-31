import java.util.Scanner;//使用Java的Scanner类需要引用，但是一般会自己来填充

public class study3_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//new=在内存中创建一个对象，创建一个Scanner对象，名字叫sc，并从键盘（System.in）读取输入
        System.out.println("请输入你的名字：");//提示用户输入
        String name=sc.nextLine();//读取一整行输入并存到name变量
        //输入一个东西，一般就是这三个为一组
        System.out.println("请输入你的年龄：");
       // Scanner sc2 = new Scanner(System.in);
        int age= sc.nextInt();
        //| 方法             | 读取类型 |
        //| -------------- | ---- |
        //| `nextLine()`   | 字符串  |
        //| `nextInt()`    | 整数   |
        //| `nextDouble()` | 小数   |
        //| `next()`       | 单个单词 |
        System.out.println("Hello\t"+name);
        System.out.println("your age is:"+age);
    }
}
