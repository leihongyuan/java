//import java.sql.*;
//
//public class Jdbc {
//    String utl="jdbc:mysql://127.0.0.1:3306/mystore?serverTimezone/UTC";
//    String user="root";
//    String password="lei610610610";
//
//    public  static void Create(){
//        String utl="jdbc:mysql://127.0.0.1:3306/mystore?serverTimezone/UTC";
//        String user="root";
//        String password="lei610610610";
//        String SQL="create table `product`(`id` int not null,`category` varchar(50) not null)";
//        try(
//                Connection con=  DriverManager.getConnection(utl,user,password);
//                Statement stm= con.createStatement();
//
//
//        ){
//            stm.executeUpdate(SQL);
//        }catch (SQLException e)
//        {e.printStackTrace();}
//    }
//    public static void insert(){
//        String utl="jdbc:mysql://127.0.0.1:3306/mystore?serverTimezone/UTC";
//        String user="root";
//        String password="lei610610610";
//        String SQL="insert product values(?,?)";
//        try(
//                Connection conn=DriverManager.getConnection(utl,user,password);
//                PreparedStatement ps=conn.prepareStatement(SQL);//填入预编译的SQL代码
//                ){
//            ps.setInt(1,1001);
//            ps.setString(2,"手机");
//            ps.executeUpdate();
//
//            ps.setInt(1,1002);
//            ps.setString(2,"笔记本电脑");
//            ps.executeUpdate();
//            System.out.println("插入值成功");
//
//        }catch (SQLException e){e.printStackTrace();}
//
//    }
//    public static void  cha_xun(){
//        String utl="jdbc:mysql://127.0.0.1:3306/mystore?serverTimezone/UTC";
//        String user="root";
//        String password="lei610610610";
//        String SQL="select * from product where id=?";
//        try(
//                Connection conn=DriverManager.getConnection(utl,user,password);
//                PreparedStatement ps=conn.prepareStatement(SQL);
//
//                ){
//            ps.setInt(1,1);
//            ResultSet rs=ps.executeQuery(SQL);
//            while (rs.next()){
//                int id=rs.getInt("id");
//                String name=rs.getString("category");
//                System.out.println(id+"  "+name);
//            }
//        }
//        catch (SQLException e){e.printStackTrace();}
//    }
//    public static void main(String[] args) {
//        Create();
//        insert();
//        cha_xun();
//
//    }
//}
