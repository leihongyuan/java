import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
class AgeException extends Exception{//继承一个异类
    public AgeException(String message){
        //可以用于重载
        //这属于构造方法（不是普通的方法），类名=方法名
        //作用：创建对象时自动调用该方法
        super(message);
        //调用父类异常构造器->交给Exception类中的message保存错误信息
        //之后就可以用e.getMassage来调用
    }
}

public class study26_throws {
    public static void checkAge(int age) throws AgeException{
        if(age<0){
            throw new AgeException("年龄不能小于0");//赋值给message
        }
        System.out.println(age);
    }
    public static void test() throws Exception{
        //throws Exception这个类可能有异常-->提前声明这个方法可能是有问题的
        //强制使用try；或者在主函数里面继续使用throws标记
        throw new Exception("测试异常");
    }
    public static void main(String[] args) throws Exception {
//        test();
//
//        int age=-1;
//        if(age<0){
//            throw new AgeException("年龄不能小于0");
//            //RuntimeException-->运行时候的异常
//            //创建一个异常的对象-->面对非法的数据-->自己抛出异常-->程序会立刻中断
//        }
//        System.out.println(age);
        try{
            checkAge(-1);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
