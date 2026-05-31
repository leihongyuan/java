import java.sql.*;

public class study39_JDBC2 {

    public static void main(String[] args)
            throws Exception {

        String url =
                "jdbc:mysql://localhost:3306/study";

        String user = "root";

        String password = "lei610610610";

        Connection conn =
                DriverManager.getConnection(
                        url,//连接的地点
                        user,//用户名
                        password//用户密码
                );

        Statement stmt =
                conn.createStatement();

        String sql =
                "SELECT * FROM student where id=1 ";
//执行查询，接收返回的结果集
        ResultSet rs =
                stmt.executeQuery(sql);
//遍历所有行
        //指针移动到下一行
        while(rs.next()){
//读取第一个
            int id =
                    rs.getInt("id");

            String name =
                    rs.getString("name");

            int age =
                    rs.getInt("age");

            System.out.println(
                    id + " "
                            + name + " "
                            + age
            );
        }

        rs.close();

        stmt.close();

        conn.close();
    }
}
//String sql =
//    "SELECT * FROM student WHERE id=?";
//
//PreparedStatement ps =
//    conn.prepareStatement(sql);
//
//ps.setInt(1,1);//第一个？位置填入1--->查询id为1的学生
//
//ResultSet rs =
//    ps.executeQuery();
//
//while(rs.next()){
//
//    System.out.println(
//        rs.getString("name")
//    );
//}