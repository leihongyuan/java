import java.io.*;
import java.net.*;
class ClientHandler implements Runnable{

    private Socket socket;

    public ClientHandler(Socket socket){

        this.socket = socket;
    }

    @Override
    public void run(){

        try{

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()
                            )
                    );

            String msg = br.readLine();

            System.out.println(
                    Thread.currentThread().getName()
                            + " 收到："
                            + msg
            );

            socket.close();

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}
public class study37_Socket_Client{

    public static void main(String[] args) throws Exception{
//连接本机的8888端口
        //127.0.0.1为本机IP也叫做localhost
        //网络通信本质(IO流)：
        //🚩 Socket建立连接
        //🚩 InputStream接收数据
        //🚩 OutputStream发送数据
        Socket socket =
                new Socket("127.0.0.1",8888);

        PrintWriter pw =
                new PrintWriter(
                        socket.getOutputStream(),
                        true
                );

        pw.println("S.T.A.Y");
//关闭建立的连接
        socket.close();
    }
}