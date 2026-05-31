import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student3 implements Serializable{
    //阐明这个对象允许序列化（对象 → 字节流 → 文件）
    //序列化的本质：保存对象状态

    String name;

    int age;

    public Student3(String name,int age){

        this.name = name;

        this.age = age;
        System.out.println("创建成功");
    }
}
public class study31_Serialization {
    public static void main(String[] args) {
        Student3 s=new Student3("leihongyuan",19);
        Student3 t=new Student3("shengxinrui",19);
        ArrayList<Student3> list=new ArrayList<>();
        list.add(s);
        list.add(t);
        list.add(new Student3("Alice",25));

        //保存对象
        try(
                ObjectOutputStream oos=
                        new ObjectOutputStream(
                                new FileOutputStream("student.dat")
                        )
                ){
            oos.writeObject(list);
        }catch (IOException e){
            e.printStackTrace();
        }

        
    }
}
