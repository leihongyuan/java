import java.util.ArrayList;
import java.util.Iterator;

public class study21_Iterator {//迭代器

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2=list;

        list.add("mouse");
        list.add("keyboard");
        list.add("USB");

        Iterator<String> it = list.iterator();
        //获取这个集合的“迭代器”-->像数据库的游标一样
//增强for循环的底层代码
        while(it.hasNext()){//it.hasNext()-->来判断后面是否还有元素

            String s = it.next();


            if(s.equals("mouse")){
                it.remove();
            }

        }
        System.out.println(list);


        for(String s : list2){

            if(s.equals("mouse")){

                list2.remove(s);

            }
        }
        System.out.println(list2);
    }
}
