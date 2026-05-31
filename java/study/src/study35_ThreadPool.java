import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyRunnable implements Runnable{

    @Override
    public void run(){

        System.out.println(
                Thread.currentThread().getName()
        );
    }
}
public class study35_ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool =
                Executors.newFixedThreadPool(3);
//不管来多少线程都是这些来执行，剩下的任务需要排队
        //把任务交给线程池，线程池自动安排那个线程去执行
        //进程可以复用，减少CPU的占用，提高效率
        pool.execute(new MyRunnable());

        pool.execute(new MyRunnable());

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
//关闭线程池
        pool.shutdown();

    }
}
