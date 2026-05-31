
class Mythread1 implements Runnable {
    char c='K';

    @Override
    public void run(){
        while (c>='A'){
            System.out.println(c);
            c--;
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){e.printStackTrace();}

        }
    }


}

class Mythread2 implements Runnable {
    char h='k';
    @Override
    public void run(){
        while (h>='a'){
            System.out.println(h);
            h--;
            try{
                Thread.sleep(600);

            }catch (InterruptedException e){e.printStackTrace();}
        }
    }

}
public class T {
    public static void main(String[] args) {
        Mythread1 m=new Mythread1();
        Mythread2 y=new Mythread2();
        Thread t=new Thread(m);//因为是从端口引用的所以要自己新建Thread，并加入
        Thread h=new Thread(y);
        t.start();
        h.start();

    }
}
