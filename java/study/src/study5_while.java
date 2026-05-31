import java.util.Random;
import java.util.Scanner;//他会自己来引入库，不用自己来写
public class study5_while {
    public static int generaNumber() {//创建这个方法
        Random rand = new Random();
        return rand.nextInt(100) + 1;//生成0~99的随机数但是不包括100，所有要加1，变成1~100
    }//返回一个整数
    public static  void playGame(){//创建一个没有返回值的方法
        Scanner sc= new Scanner(System.in);
        int target=generaNumber();//将返回的值交给target
        int guess=0;
        int sum=3;
        while (guess!=target&&sum>=0){
            System.out.println("请输入你猜的数字,机会只有"+sum+"次哦：");
            guess=sc.nextInt();
            sum--;
            if(guess>target){
                System.out.println("猜大了");
            } else if(guess<target) {
                System.out.println("猜小了");
            }
        }
        if (guess==target) {
                System.out.println("恭喜你，猜对了");
        }else{
                System.out.println("机会没有了哦,正确答案是："+target);
            }


    }

    public static void main(String[] args) {
        playGame();//运行这个方法
    }
}
