import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class jdbc2 {
    private final static String url="jdbc:mysql://127.0.0.1:3306/mystore?serverTimezone=UTC";
    private final static String user="root";
    private final static String password="lei610610610";
    //定义的全局变量，即使在static中也能使用
    //定义一个只在当前类内部使用的、不可改变的、属于类级别的字符串常量。

    public static void create(){
        String sql="create table if not exists `pe`(`id` int not null,`name` varchar(100) not null,`sale` varchar(10) not null)";
        try(Connection conn= DriverManager.getConnection(url,user,password);
            Statement stm=conn.createStatement();
        ){
            stm.executeUpdate(sql);
        }catch (SQLException e){e.printStackTrace();}
    }
    public static void insert(){
        String sql="insert into people (id,name,sale) values(?,?,?)";
        try(
                Connection conn=DriverManager.getConnection(url,user,password);
                PreparedStatement ps=conn.prepareStatement(sql)
                ){
            ps.setInt(1,1);
            ps.setString(2,"l");
            ps.setString(3,"m");
            ps.executeUpdate();

            ps.setInt(1,2);
            ps.setString(2,"weilai");
            ps.setString(3,"w");
            ps.executeUpdate();

        }catch (SQLException e){e.printStackTrace();}
    }
    public static void cha_xun(){
        String sql="select * from people where id=?";
        try(
                Connection conn=DriverManager.getConnection(url,user,password);
                PreparedStatement ps=conn.prepareStatement(sql);

                ){
            ps.setInt(1,1);
            try(
                    ResultSet rs=ps.executeQuery()
                    ){
                while (rs.next()){
                    int i=rs.getInt("id");
                    String name=rs.getString("name");
                    String sale=rs.getString("sale");
                    System.out.println(i+"  "+name+"  "+sale);
                }
            }catch (SQLException e){e.printStackTrace();}

        }catch (SQLException e){e.printStackTrace();}
    }
    public static void main(String[] args) {
        create();
        insert();
        cha_xun();

    }
}
