import java.util.Scanner;
class compute{
    int n;
    double sum=0;
    int temp;
    double f=1;

    public compute(int n){
        this.n=n;
    }
    public void code(){
        if(n<3){
            System.out.println("输入的n值必须大于或者等于3！");
        }else {
            temp=2*n-1;
           while (f<=temp){
               sum+=4*(1/f);//f、sum需要为double类型，不然就会只能保留整数部分或者为1.0(有一个为浮点数)
               f+=2;
           }
           System.out.println("答案为："+sum);
        }
    }
}

public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数n");
        int i=sc.nextInt();
        compute c=new compute(i);
        c.code();


    }
}
