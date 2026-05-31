//多进程先要继承以下
class Ticket implements Runnable{

    int ticket = 100;

    @Override
    public void run(){

        while(ticket > 0){

            System.out.println(
                    //当前执行的进程
                    Thread.currentThread().getName()
                            + "卖出："
                            + ticket
            );

            ticket--;
        }
    }
}
class Ticket2 implements Runnable{

    int ticket = 100;

    //创建一个锁的对象

    Object lock = new Object();

    @Override
    public void run(){

        while(true){
//进入进程所需一把钥匙（锁对象）
            synchronized(lock){

                if(ticket <= 0){
//退出循环
                    break;
                }

                System.out.println(
                        Thread.currentThread().getName()
                                + "卖出："
                                + ticket
                );

                ticket--;
            }
        }
    }
}
public class study34_Synchronized{

    public static void main(String[] args){

        Ticket t = new Ticket();
//创建两个对于t的新的进程
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();
        //可能出现两个进程因为时间差而导致取值不正确导致的错误
//来一个任务创建一个线程
        Ticket2 t3 = new Ticket2();
//创建两个对于t的新的进程
        Thread t4 = new Thread(t3);
        Thread t5 = new Thread(t3);

        t4.start();
        t5.start();
    }
}
//Java中一切皆为对象(  数据--name + 行为--study() )---->出了基本的类型（int、double、boolean）
//使用2：锁方法
//public synchronized void sell(){
//
//}
//使用3：锁类
//public static synchronized void test(){
//
//}