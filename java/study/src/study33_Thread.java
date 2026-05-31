class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("子线程："+i);
        }
    }
}
public class study33_Thread {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        //继承父类的方法，执行多线程
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("主线程："+i);
        }

    }
}
//一个进程中可以有多个线程（类似一家公司有多个员工）
