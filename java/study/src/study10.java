import java.util.Scanner;

class Person1{
    public String name;
    public int age;
    private int money;//private 能继承，但是不能直接访问
    public void eat(){
        System.out.println("person can eat something");
    }



    //重构，能够依据输入的参数执行不同的流程



    public Person1(String name){
        this.name=name;
    }//有参构造
    //无参构造就是与有参构造相反
    public Person1(String name,int n){//这个就类似于一个方法
        this.name=name;
        this.age=n;

    }
    public Person1(){
        System.out.println("please input your argument");
    }

    public void study(){
        System.out.println(name+" is learning now"+age);
    }

}
class Student1 extends Person1{//Student 对象里面，其实“包含了一个 Person”
    int score;
    public void Score(){
        System.out.println(name+" is learning now, and get "+score+" scores");
    }
    public Student1(String name,int score){
        super(name,score);


        //必须写在第一行

        //super(参数) → 根据参数匹配父类的对应构造器。

        //你的 name 是 String → 匹配到 Person1(String name) → 调用成功。

        this.score=score;
    }
    public void sayHello(){
        System.out.println("hello, my name is "+name);
    }
    public void study(){
        System.out.println(name+" is studying Java deeply");
    }
}
public class study10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("please input your name:");
        String name=sc.nextLine();
        System.out.println("please input your score:");
        int score=sc.nextInt();
        Student1 s=new Student1(name,score);
//        s.name="lei";
//        s.age=20;
//        s.score=100;
        s.eat();//子类可以调用父类的东西
        s.study();
        s.Score();
        s.sayHello();
        Person1 p=new Person1();
        p.study();
        System.out.println(s.age);


    }

}
