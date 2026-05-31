public class study25_Exception {
    public static void main(String[] args) {
        try {//尝试执行
            int a=10;
            int b=0;
            System.out.println(a/b); //-->程序异常-->崩溃

        }catch (Exception e){//捕捉异常
            System.out.println("程序出错");
            System.out.println(e);//里面包含出错的类型
            e.printStackTrace();//展示错误的传播路径
        }finally {
            System.out.println("finally执行");
        }

    }
}
