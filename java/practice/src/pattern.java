import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class pattern extends Application {//这个Application一开始会报错，要自己收到点击提示来导入
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        //注意不要导错包了，不是点缀为：“.awt”,而是fx那个。
        TextField f=new TextField();
        Button b=new Button("统计");
        Label l=new Label("结果：");
        b.setOnAction(e->{
           String s=f.getText();
           int sum=0;
           for(char i:s.toCharArray()){
               if(i>='A'&&i<='Z'){
                   //字符串（"A"）不能比较，但是字符（'A'）可以比较，而且还可以加减
                   sum++;
               }
           }
           l.setText("字符串中有"+sum+"个大写字母");
           //数字 0–9：连续编码 48–57，即字符 '0' = 48。
            //
            //大写字母 A–Z：连续编码 65–90，'A' = 65。
            //
            //小写字母 a–z：连续编码 97–122，'a' = 97。
            //
            //大小写相差 32：'a' = 'A' + 32。
        });
        VBox v=new VBox();
        v.getChildren().addAll(
                f,
                b,
                l
        );
        Scene g=new Scene(v,350,200);

        stage.setTitle("统计大写字母个数");
        stage.setScene(g);
        stage.show();

    }
}