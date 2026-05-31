public class study15_String {
    public static void main(String[] args) {
        String s1="abc";
        //String的不可变性：
        //不可变性保证线程安全和哈希稳定性
        //String对象一旦创建，它里面的字符内容就不能被修改
        //任何修改都会产生一个新的String对象,所以如果使用循环拼接-->非常消耗内存、CPU
        //eg：String s = "";
        //for(int i = 0; i < 1000; i++){
        //    s += i;
        //}
        String s2="abc";
        String s3=new String("abc");
        String s4=new String("abc");
        String s5=s1+" def";
//String不可变性的解决方法如下：
        StringBuilder sb = new StringBuilder();//只会创建一个可变对象
        for(int i = 0; i < 10; i++){
            sb.append(i);
        }
        String result = sb.toString();//最终形成String对象

        System.out.println(s1==s2);
        //结果为:ture,因为java发现‘abc’已经存在-->直接复用-->同一个地址
        System.out.println(s3==s4);
        //结果为：False,因为强制创建了一个新的对象--->地址不一样
        System.out.println(s3.equals(s4));
        //结果为：true,因为比较的是字符串中的字符内容
        System.out.println(s5);
        System.out.println(sb);

    }
}
