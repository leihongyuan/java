//接口，类似于积木块
interface Swim{
    //接口类的方法都不能有实例
    void swim();
}
interface Fly{
    //
    void fly();

}
interface Playable{
    void play();
}
class Dog1 implements Playable{
    public void play(){
        System.out.println("Dog can play plant");
    }
}
class Duck implements Swim,Fly{
    //一个类可以“多继承能力”
    //不要依赖具体类，要依赖抽象（接口/父类）
    public void swim(){
        System.out.println("Duck can swim");
    }
    public void fly(){
        System.out.println("Duck can fly");
    }
}
public class study13 {
    public static void makeFly(Fly f){
        f.fly();
    }
    public static void main(String[] args) {
        //Duck d=new Duck();
        Fly d=new Duck();
        d.fly();
        //d.swim();
        Duck d1=new Duck();
        makeFly(d);
       makeFly(d1);
       //makeFly()中可以上传所有具有Fly能力的类，不需要去修改

       //方法二：
        //study13 s=new study13;
        //s.makeFly(d);
    }
}
//       | 维度    | 抽象类  | 接口     |
//        | ----- | ---- | ------ |
//        | 含义    | 是什么  | 能做什么   |
//        | 关系    | is-a | can-do |
//

