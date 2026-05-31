import com.sun.xml.internal.ws.handler.ClientLogicalHandlerTube;
import com.sun.xml.internal.ws.handler.ClientMessageHandlerTube;

import java.io.*;
import java.net.*;

public class study36_Socket_Server{

    public static void main(String[] args) throws Exception{
//服务器监听8888端口
        ServerSocket server =
                new ServerSocket(8888);

        System.out.println("服务器启动");
//等待客户端连接
        while(true){
            //while循环--->永远等待客户端连接
            Socket socket =
                server.accept();
            //每一个客户端都创建一个新的线程
            //每个线程独立处理自己的客户端
            //这个建立的线程可以优化为线程池
        new Thread(
                new ClientHandler(socket)
        ).start();
        }

//
//        System.out.println("客户端连接成功");
//
//        BufferedReader br =
//                new BufferedReader(
//                        //建立InputStream接收数据
//                        new InputStreamReader(
//                                socket.getInputStream()
//                        )
//                );
//
//        String msg = br.readLine();
//
//        System.out.println("收到：" + msg);
////连接断开
//        socket.close();
////服务器关闭
//        server.close();
    }
}