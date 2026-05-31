import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

    //JDBC本质：Java连接数据库的桥梁
    //步骤：
    //1.连接数据库
    //2.执行SQL
    //3.获取结果
    //4.关闭资源


    public class study38_JDBC {

        public static void main(String[] args) throws Exception {

            // 1.数据库连接地址
            String url =
                    "jdbc:mysql://localhost:3306/study";
            //| 部分         | 含义      |
            //| ---------- | ------- |
            //| jdbc:mysql | 使用MySQL |
            //| localhost  | 本机ip     |
            //| 3306       | MySQL端口 |
            //| study_db   | 数据库名    |

            // 2.用户名
            String user = "root";

            // 3.密码
            String password = "lei610610610";

            // 4.建立连接
            Connection conn =
                    DriverManager.getConnection(
                            url,//数据库地址
                            user,//用户名
                            password//密码
                    );

            System.out.println("连接成功");

            // 5.创建SQL执行对象
            //执行更新
            Statement stmt =
                    conn.createStatement();

            // 6.SQL语句
            String sql =
                    "INSERT INTO student VALUES(3,'sheng',19);"
                    ;

            // 7.执行SQL
            //用于insert、update、delete
            //返回影响的行数
            int rows =
                    stmt.executeUpdate(sql);

            System.out.println(
                    "影响行数：" + rows
            );

            // 8.关闭资源
            stmt.close();

            conn.close();
        }
    }
    //更安全的版本
    //import java.sql.*;
//
//public class Demo {
//
//    public static void main(String[] args)
//        throws Exception {
//
//        String url =
//            "jdbc:mysql://localhost:3306/study";
//
//        String user = "root";
//
//        String password = "lei610610610";
//
//        Connection conn =
//            DriverManager.getConnection(
//                url,
//                user,
//                password
//            );
//
//        String sql =
//            "INSERT INTO student VALUES(?,?,?)";
// 这里是预编译SQL，用户只用填入数值，不用写结构
//
//        PreparedStatement ps1 =
//            conn.prepareStatement(sql);
//
//        ps1.setInt(1,2);//第一个位置，插入Int类型的2
//
//        ps1.setString(2,"Jack");
//
//        ps1.setInt(3,20);
//ps1.executeUpdate();//执行代码

//ps2.setInt(1,4);
//ps2.setString(2,"li");
//ps2.setInt(3,19);
//
//        int rows =
//            ps2.executeUpdate();//执行第二段的代码
//
//        System.out.println(rows);
//
//        ps.close();
//
//        conn.close();
//    }
//}

