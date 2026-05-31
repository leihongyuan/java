class Student{//创建一个类
    private String name;//如果写了private，那只能在 Student 类内部访问
    private int age;//利用private将变量封装=控制数据=给数据加一层“保护膜”
    static String school;//static是一种类，所有的对象共用一个
    public static void setSchool(String school){
        Student.school=school;//static是一个类，this代表对象eg：this--学生，static--学校
    }

    public void setName(String name){//公用的方法public
        this.name=name;//将外部的name转换到类的里面==接受
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){//==输出
        return name;
    }
    public int getAge(){
        return age;
    }
    public void study(){
        System.out.println(name+"正在学习");
    }
}
class Car{
    private String brand;
    private double speed;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setSpeed(double speed){
        this.speed=speed;
    }
    public String getBrand(){
        return brand;
    }
    public double getSpeed(){
        return speed;
    }
    public void run(){
        System.out.println(brand+"正在以"+speed+" Km/h行驶");
    }
}
public class study7 {
//若将public class Student放在study7内部会出错
//问题本质：main 是 static（静态方法）；student 是非静态内部类；
//问题原因：内部类 student 属于 study7 对象，但 main 运行时还没有 study7 对象；JVM → 加载类 → 找main->直接执行
    public static void main(String[] args) {//main必须在类的直接的下一个级之中
        //static类之中可以不建立对象，（见下面）
        Student s1= new Student();
        Student s2=new Student();
        s1.setSchool("清华大学");

        //创建一个student类的对象，JVM不会自动的创建对象
        //s1.name="leihongyuan";
        //s1.age=20;调用student类里面的变量（如果这个变量不是private）
        System.out.println("I'm(s2) in "+s2.school);//相同类的对象static都是一样的，不用再次设置
        s1.setName("leihongyuan");
        s1.setAge(19);
        s1.study();
        System.out.println("姓名："+s1.getName());
        System.out.println("年龄："+s1.getAge());
        Car c=new Car();
        c.setBrand("xiaomi");
        c.setSpeed(188);
        c.run();
    }
}
//类（class） class Student 本质：一个“模板 / 蓝图”；
//对象（object） Student s1=new Student(); 本质：根据类创建的“真实存在的东西”；
//属性（变量） String name; 本质：对象的数据；
//方法（Method） public void study() 本质：对象的行为 类似：函数

//static用法：
//1.共享数据
//static int count;
//2.工具方法
//public static void printHello() {
//    System.out.println("Hello");
//}
//特点：不需要创建对象就能用 eg：Student.printHello();
//限制：static 方法里 不能直接用 非static变量
// static void test() {
//    System.out.println(name); // ❌
//}
//3.为什么 main 必须是 static？
//JVM不用new对象，就能直接调用main方法，程序才能正常启动。