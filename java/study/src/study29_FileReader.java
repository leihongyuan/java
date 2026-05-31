import javax.annotation.processing.Filer;
import java.io.FileReader;
import java.io.IOException;

public class study29_FileReader {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("test.md")){
            //FileReader fr=new FileReader("test.md");
            //可以通过以上的写法，自动的运行close（）
            int S=fr.read();//读到最后会返回一个-1-->来表示结束
            char c=(char)S;
            System.out.println(S);//打印他的ASCII码
            System.out.println(c);//将其强制转换为char（字符类型）
            while ((S=fr.read())!=-1){//运行fr.read()的时候会自动的更新
                System.out.println((char)S);
            }
            //fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
