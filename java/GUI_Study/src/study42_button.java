import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class study42_button extends Application {

    @Override
    public void start(Stage stage) {

        // 创建按钮（家具）
        Button button =
                new Button("点击我");
        //设置反应
        button.setOnAction(e->{
            System.out.println(
                    "成功点击"
            );
        });

        // 创建场景（房间）
        Scene scene =
                //设置button的长、宽
                new Scene(button,100,200);

        // 设置窗口场景（房子）
        stage.setScene(scene);

        stage.setTitle("JavaFX按钮");

        stage.show();
    }

    public static void main(String[] args) {
//整体启动
        launch();
    }
}