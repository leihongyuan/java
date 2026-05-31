import java.io.*;

public class study30_BufferedReader {
    public static void main(String[] args) {
        try(
                BufferedWriter bw=
                        new BufferedWriter(
                                new FileWriter("test.md",true)
                        )//加一个ture，可以持续的添加不用覆盖

                ){
            bw.write("my name is ");
            //换行
            bw.newLine();
            bw.write("leihongyuan");

        }catch (IOException e){
            e.printStackTrace();
        }


        try(
                BufferedReader br=
                        new BufferedReader(
                                new FileReader("test.md")
                        )
                ) {
            String line;
            while ((line=br.readLine())!=null){
                //br.readline()一次可以读一行
                //此条件可以一边来判断，一边来读取下一行
                System.out.println(line);
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
