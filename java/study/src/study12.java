abstract class Animal{//抽象类：我知道你应该有这个功能，但我不知道你具体怎么实现
    public abstract void eat();//先暂时不用写内容
    public void sleep(){
        System.out.println("所有动物都要吃饭");
    }
}
//如果继承抽象类，那么必须要有他的所有的抽象方法
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃肉");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
public class study12 {
    public static void main(String[] args) {
        Animal a=new Dog();
        //Animal a = new Animal(); ❌-->不能实例化抽象类
        //多态：编译看左边：a是Animal类型，所以只能调用a.eat()、a.sleep();
        //运行看右边：真正执行的是：Dog的eat()
        a.eat();
        a.sleep();
    }
}
