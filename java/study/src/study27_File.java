import java.io.File;
import java.io.IOException;

public class study27_File {
    public static void main(String[] args) {
        File f=new File("test.md");
        try{
            if(f.createNewFile()){//用来判断是否创建成功
                System.out.println("文件创建成功");
            }else {
                System.out.println("文件已经存在");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
