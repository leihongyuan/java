import java.util.Scanner;

//循环的几种方式
class for_X{
    public int i;
    public int sum=0;
    public void setI(int i){
        this.i=i;
    }
    public int getI(){
        return i;
    }
    public void meThod1(){

        for( ;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public void meThod2(){
        do{
            i++;
            sum+=i;
            System.out.println(sum);
        }while (i<=100);//先执行，再判断（至少执行一次）
    }



}
public class study9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input value of i");
        int i=sc.nextInt();
        for_X st=new for_X();
        st.setI(i);

        System.out.println("please choose your method in 1~2");
        int n=sc.nextInt();
        switch (n)
        {
            case 1: st.meThod1();
                    break;//没有break他会贯穿执行
            case 2: st.meThod2();
                    break;
            default:System.out.print("please try again");
        }



























    }
}
