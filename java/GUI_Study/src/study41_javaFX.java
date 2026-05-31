import javafx.application.Application;
import javafx.stage.Stage;

public class study41_javaFX extends Application {
//继承Application类
    @Override
    public void start(Stage stage) {
//编写标题
        stage.setTitle("我的第一个JavaFX");
//展示
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}