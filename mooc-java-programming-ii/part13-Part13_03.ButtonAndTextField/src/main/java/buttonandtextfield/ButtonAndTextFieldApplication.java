package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
       launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button btn = new Button("Button");
        TextField txt = new TextField("Some text");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(btn);
        componentGroup.getChildren().add(txt);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }
}
