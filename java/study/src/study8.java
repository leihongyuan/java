import java.util.Scanner;

class Person{
    private String name;
    public int pd=1;
    public  void setName(String name) {
        this.name = name;
        }
    public String getName(){
        return name;
    }

    public void checkName(){
            if  (!name.equals("leihongyuan"))//if not 是python的写法；但是如果name==null，就会报错
            {//if (!"leihongyuan".equals(name))，.equals是字符串的方法，只要前面的为字符串就行，但是不能为空指针，会报错。
                System.out.println("please try again!");
                pd=0;
            }
            else{
                System.out.println("Hello,my master");
            }

        }
    }

public class study8 {

    public static void main(String[] args) {
        String target="leihongyuan";
        Person p1=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("please input your account!");
        String name=sc.nextLine();
        while (!name.equals(target)) {

            System.out.println("please input your account again!");
            name=sc.nextLine();
            p1.setName(name);
            p1.checkName();

        }
            //if(name.equals("leihongyuan")){//不能使用：name == "雷雷"，
            //== 比的是地址
            //equals 比的是内容
//            System.out.println("Welcome to java");
//            System.out.println("Your name is "+name.length(name)+"size");
        }
    }

//类的模板

//class 类名 {
//
//    // 1. 属性
//    private 类型 属性名;
//
//    // 2. setter
//    public void setXxx(...) {}
//
//    // 3. getter
//    public 类型 getXxx() {}
//
//    // 4. 业务方法
//    public void doSomething() {}
//
//}
