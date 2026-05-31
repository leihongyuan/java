import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class file {

    public static void Rand(){
        try(
                DataOutputStream dos=new DataOutputStream(
                        new FileOutputStream("data.dat")
                        //如果加true，就可以不用覆盖原文件
                        //如果没有该文件，它可以自己创建一个文件
                        //
                         //以下代码也可以创建文件：
                        //File f = new File("data.dat");
                        //File只负责描述文件地址，不负责创建
                        //f.createNewFile();
                )
                ){
            int s;
            Random t=new Random();
            int[] y=new int[10];
            for(int i=0;i<10;i++){

                s=t.nextInt(1000,2000);
                //也可以使用：
                //t.nextInt(1001)+1000;
                y[i]=s;

                dos.writeInt(s);//写入的时候就会变成四个字节，成为字节流


            }
            System.out.println("这十个数分别是："+Arrays.toString(y));
        }catch (IOException e){
            e.printStackTrace();
        }


    }
    public static void Read(){
        try(
                DataInputStream dis=new DataInputStream(
                        new FileInputStream("data.dat")
        )
                ){
            int sum=0;
            int t=dis.readInt();
            for(int i=0;i<10;i++){

                sum+=t;

            }
            System.out.println("这十个数之和为："+sum);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        Rand();
        Read();

    }
}

///结构：
//                负责解释数据
//                     ↑
//DataInputStream
//                     ↑
//          负责读取文件字节
//                     ↑
//FileInputStream
//                     ↑
//               data.dat

///原理：
//第一层：
//
//FileInputStream
//
//负责：
//
//从文件拿字节
//
//第二层：
//
//DataInputStream
//
//负责：
//
//把字节解释成int、double等

/// 所有的关系：
//| 类                    | 作用                |
//| -------------------- | ----------------- |
//| File                 | 文件路径对象            |
//| FileInputStream      | 从文件读取字节           |
//| FileOutputStream     | 向文件写字节            |
//| BufferedInputStream  | 给输入流增加缓存，提高速度     |
//| BufferedOutputStream | 给输出流增加缓存，提高速度     |
//| DataInputStream      | 读取int、double等基本类型 |
//| DataOutputStream     | 写入int、double等基本类型 |
//| ObjectInputStream    | 读取整个对象            |
//| ObjectOutputStream   | 写入整个对象            |

///IO体系图：
//文件
// │
// ├── FileInputStream
// │
// ├── BufferedInputStream
// │      ↑
// │    提高速度
// │
// ├── DataInputStream
// │      ↑
// │    读基本类型
// │
// └── ObjectInputStream
//        ↑
//      读对象

//程序
// │
// ├── FileOutputStream
// │
// ├── BufferedOutputStream
// │      ↑
// │    提高速度
// │
// ├── DataOutputStream
// │      ↑
// │    写基本类型
// │
// └── ObjectOutputStream
//        ↑
//      写对象