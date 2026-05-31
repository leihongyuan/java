import java.util.Scanner;

public class study4_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        if(score>=90){//score==90是比较而不是赋值
            System.out.println("等级 A");
        }else if (score>=80){//多个假设就用if else
            System.out.println("B");
        }else if (score>=60){
            System.out.println("C");
        }
        else{
            System.out.println("考试不及格");
        }
    }
}
