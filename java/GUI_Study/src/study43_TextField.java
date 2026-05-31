import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class study43_TextField extends Application {

    @Override
    public void start(Stage stage) {

        // 输入框
        TextField textField =
                new TextField();
        Label t=new Label("count:");
        textField.setPromptText("please input your count");

        //输入框2
        PasswordField textField1=
                new PasswordField();
        Label t1=new Label("password:");
        //没填时候的提示词
        textField1.setPromptText("please input your password");

        // 按钮
        Button button =
                new Button("log in");

        // 点击事件
        button.setOnAction(e -> {

            String text =
                    textField.getText();//获得方框中的信息
            String text1 =
                    textField1.getText();

            System.out.println(
                    "输入内容：" + text

            );
            System.out.println("I CREATE:"+text1);
            //在对话框中展示你输入的内容
            t.setText("You input:"+text);
        });
        //网格布局
        GridPane root=new GridPane();
        //列之间的间距
        root.setHgap(10);
        //行之间的间距
        root.setVgap(10);
        //留20像素边距
        root.setPadding(
                new Insets(20)
        );
        //先是列再是行
        root.add(t,0,0);
        root.add(textField,1,0);
        root.add(t1,0,1);
        root.add(textField1,1,1);
        root.add(button,1,2);

        /// 垂直布局（只能从下往上）
        //可以容纳多个东西
//        VBox root =
//                new VBox();
////往布局中添加控件
//        root.getChildren()
//                .addAll(
//                        t,
//                        textField,
//                        t1,
//                        textField1,
//                        button
//                );

        Scene scene =
                new Scene(root,350,200);

        stage.setScene(scene);

        stage.setTitle("输入框学习");

        stage.show();
    }
//结构（从底层开始创建）
// Stage
// └── Scene
//      └── VBox
//           ├── TextField
//           └── Button
    public static void main(String[] args) {

        launch();
    }
}
//以下还没有学：
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.scene.Scene;
//import javafx.scene.control.ListView;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) {
//
//        ListView<String> listView =
//            new ListView<>();
//
//        listView.setItems(
//            FXCollections.observableArrayList(
//                "Tom",
//                "Jack",
//                "Lucy"
//            )
//        );
//
//        Scene scene =
//            new Scene(listView,300,200);
//
//        stage.setScene(scene);
//
//        stage.setTitle("学生列表");
//
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//
//        launch();
//    }
//}