import java.util.ArrayList;
import java.util.List;

public class study19_ArrayList {
    public static void main(String[] args) {
        //创建动态数组
        ArrayList<String> list =new ArrayList<>();
        //<String>表示这个动态数组中只能存String--->< >中的泛型只能是类-->int就不行
        //添加元素
        list.add("fail");
        list.add("success");
        list.add("i will make up my life");
        //打印
        System.out.println(list);//可以直接打印
        System.out.println(list.get(0));//可以根据下标来获取元素
        //更改元素
        list.set(1,"fail is necessary");//下标为1-->第二个元素
        System.out.println(list);
        //删除元素
        list.remove(0);//删除第一个元素
        //检测其大小
        System.out.println(list.size());//检测其大小
        //简单for循环
        for(int i=0;i<list.size();i++){
            System.out.println("循环一："+list.get(i));
        }
        //增强for循环
        for(String s:list){//每次从list中取一个元素给s
            System.out.println(s);
        }


        //实践
        ArrayList<Integer> love=new ArrayList<>();
        //使用Integer（包装类）可以装int类型
        love.add(520);
        love.add(80);
        int sum=0;//如果sum在for里面就是局部变量
        for(int i:love){

            sum+=i;
        }
        System.out.println(sum);
        //| 基本类型    | 包装类       |
        //| ------- | --------- |
        //| int     | Integer   |
        //| double  | Double    |
        //| char    | Character |
        //| boolean | Boolean   |

    }
}
