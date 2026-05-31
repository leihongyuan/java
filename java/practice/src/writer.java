import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writer {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        int i=0;
        list.add("物联网系");
        list.add("智科类");
        list.add("计算机系");
        list.add("软件系");
        list.add(2,"基础系");
        for(String s:list){

            if(s.equals("基础系")){
                list.set(i,"办公室");
            }
            i++;

        }
        System.out.println(list);
        try(
                BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\test.txt"))//还可以指定文件路径

                ){
            for(String t:list){
                bw.write(t);
                bw.newLine();

            }

        }catch (IOException e)
        {e.printStackTrace();}
    }
}
