import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class study32_ObjectInputStream {
    public static void main(String[] args) {
        //程序有状态，文件 → 字节流 → 对象
        try(
                ObjectInputStream ois=
                        new ObjectInputStream(
                                new FileInputStream("student.dat")
                        )
                ){
            //强制转换为ArrayList<Student3>类型并赋值
            ArrayList<Student3> list =(ArrayList<Student3>)ois.readObject() ;

        for(Student3 s:list){
            System.out.println(s.name);
            System.out.println(s.age);
        }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //🚩 文本保存：
    //
    //像：
    //
    //把汽车拆成零件清单
    //
    //例如：
    //
    //轮子=4
    //颜色=红
    //发动机=V8
    //🚩 恢复时：
    //
    //你自己重新拼车。
    //
    //🚩 序列化：
    //
    //像：
    //
    //整车打包运输
    //🚩 恢复时：
    //
    //直接得到完整汽车。
}
