import java.io.FileWriter;
import java.io.IOException;

public class study28_FileWriter {
    public static void main(String[] args) {
        try{
            //打开/创建文件
            FileWriter fw=new FileWriter("test.md");
            //写入文本
            fw.write("Hello Java");
            //关闭文件-->防止文件损坏、文件被占用
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
