class Person3{
    public void speak(){
        System.out.println("人会说话");
    }
}
class Student2 extends Person3 {
    @Override//让编译器帮你检查是否正确重写
    public void speak() {
        System.out.println("学生在学习");
    }


}
public class study11 {
    //多态：同一个方法，不同对象，不同行为；父类引用 指向 子类对象
    public static void makeSpeak(Person3 p) {//均为Person3类，编译的时候为同一个类
        p.speak();//不能含有对象的变量，可以有方法
    }
    public static void main(String[] args) {
        Person3 p,p2;//同一套代码处理不同的对象(类似与C语言的struck)
        p=new Student2();
        p2=new Person3();
        //编译看左边（Person）
        //运行看右边（Student）
        p.speak();
        p2.speak();
        makeSpeak(p);//可以直接调用方法
        makeSpeak(p2);

    }
}
