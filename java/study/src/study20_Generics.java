import sun.awt.AWTSecurityManager;

import java.util.ArrayList;

class Box<T>{
    //本质：适应任何类型的数据，然后都能使用该class
    //T-->type，用于给类型占位

    T data;

    public void setData(T data){

        this.data = data;
    }

    public T getData(){

        return data;
    }
    //表示适配所有的类型都能使用该方法
//| 部分     | 作用      |
//| ------ | ------- |
//| `<T>`  | 声明泛型类型  |
//| `void` | 方法返回值类型 |-->如果有返回值，就将void改为T
//这里的T并不是Box中的T，而是自定义的一个(依据传进来的值的类型)
    public <T> void show(T data){
        System.out.println(data);

    }
    //泛型交换方法
    //static类之后必须声明<T>
    public static <T> void printArray(T[] arr){
        for(T t:arr){
            System.out.println(t);
        }
    }
    //通配符
    //上界
    //<? extends Number>--->表示必须是Number这个数据类型的子类
    //Object
    //   ↑
    // Number
    // ↑  ↑  ↑
    //Integer Double Float

    //下界
    //<? super Integer>
    //Integer 或 Integer父类
    public void printList(ArrayList<?> list){
        //<?>什么类型的集合都能打印
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
public class study20_Generics {
    public static void main(String[] args) {
        ArrayList<USB> device=new ArrayList<>();
        device.add(new Mouse());
        device.add(new UDisk());
        for(USB i:device){//利用迭代器-->没有下标也可以循环
            i.connect();
        }
        //没有加入泛型-->以下的代码会报错：类型转换异常
//        ArrayList list=new ArrayList();
//        list.add("leihongyuan");
//        list.add(123);
//        list.add(true);
//        String s=(String)list.get(1);
//        System.out.println(s);

        //任意的类型都可以使用该class
        Box<String> box=new Box<>();
        box.setData("123456");
        System.out.println(box.getData());

        Box<Integer> s=new Box<>();
        s.setData(15);
        System.out.println(s.getData());

        s.show("df");
        String[] names={"Tom","Jack"};
        Integer[] nums={1,2,3};

        //因为在Box中，printArray这个方法是static，所以在这里不用创建对象可以直接使用
        Box.printArray(names);



    }
}
//所有的类最终都继承Object
//Object o = "abc";
//
//Object o2 = 123;
//
//Object o3 = new Student();
