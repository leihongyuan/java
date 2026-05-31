

public class study6_class {
    public  static  void sayHell0(String name){//void返回类型，没有返回值
        System.out.println("Hello,Jave\t" +name);
    }
//    返回值类型 方法名(参数) {
//        方法体
//        return 返回值;
//    }
    public  static  int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        sayHell0("leihongyuan");//调用方法
        int result=add(3,5);
        System.out.println(result);

    }
}
