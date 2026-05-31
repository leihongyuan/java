import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class pattern2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        TextField f=new TextField();
        Label l=new Label();
        Button button=new Button("统计");
        button.setOnAction(e->{
           String s=f.getText();
           int sum=0;
           for (char c:s.toCharArray()){
               if(c>='A'&&c<='Z'){
                   sum++;


               }
               l.setText("字符串中有"+sum+"个大写字母");
           }
        });
        VBox v=new VBox();
        v.getChildren().addAll(
                f,
                button,
                l
        );
        Scene s=new Scene(v,350,100);
        stage.setScene(s);
        stage.setTitle("统计大写字母个数");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
