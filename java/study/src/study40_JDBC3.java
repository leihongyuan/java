import java.sql.*;
class Student5 {

    private int id;

    private String name;

    private int age;

    public Student5(){}

    public Student5 (
            int id,
            String name,
            int age
    ){

        this.id = id;

        this.name = name;

        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//将数据库封装起来
//如何操作数据库
 class StudentDAO {

    private String url =
            "jdbc:mysql://localhost:3306/study";

    private String user =
            "root";

    private String password =
            "lei610610610";

    // 添加学生
    public void addStudent(Student5 s)
            throws Exception{

        Connection conn =
                DriverManager.getConnection(
                        url,
                        user,
                        password
                );

        String sql =
                "INSERT INTO student VALUES(?,?,?)";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(1,s.getId());

        ps.setString(2,s.getName());

        ps.setInt(3,s.getAge());

        ps.executeUpdate();

        ps.close();

        conn.close();
    }
}
class ShowStudent{
    private String url =
            "jdbc:mysql://localhost:3306/study";

    private String user =
            "root";

    private String password =
            "lei610610610";


}
public class study40_JDBC3 {

    public static void main(String[] args)
            throws Exception {

        Student5 s =
                new Student5(
                        1,
                        "Tom",
                        18
                );
//如果不加入参数，默认填写0和null
        StudentDAO dao =
                new StudentDAO();

        dao.addStudent(s);

        System.out.println("添加成功");
    }
}
//执行事务（了解即可）
//Connection conn =
//    DriverManager.getConnection(
//        url,user,password
//    );
//
//try{
//
//    conn.setAutoCommit(false);
//
//    PreparedStatement ps1 =
//        conn.prepareStatement(
//            "UPDATE account SET money=money-100 WHERE name='A'"
//        );
//
//    PreparedStatement ps2 =
//        conn.prepareStatement(
//            "UPDATE account SET money=money+100 WHERE name='B'"
//        );
//
//    ps1.executeUpdate();
//
//    // 模拟错误
//    int x = 1 / 0;
//
//    ps2.executeUpdate();
//
//    conn.commit();
//
//}catch(Exception e){
//
//    conn.rollback();
//
//    System.out.println("事务回滚");
//}