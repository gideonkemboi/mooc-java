package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        VBox layout = new VBox();
        TextField textField = new TextField("");
        Button btn = new Button("Update");
        Label text = new Label("");

        btn.setOnAction((event) -> {
            text.setText(textField.getText());
        });

        layout.getChildren().addAll(textField, btn, text);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }
}
