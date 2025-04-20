package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {

        Label instructionText = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button startButton = new Button("Start");

        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(startButton, 0, 2);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene nameView = new Scene(layout);

        Label welcomeText = new Label("Welcome!");

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        startButton.setOnAction((event) -> {
            if (!textField.getText().isEmpty()) {
                welcomeText.setText("Welcome " + textField.getText() + "!");
                window.setScene(welcomeView);
            }
            
            System.out.println(textField.getText());

        });

        window.setScene(nameView);
        window.show();
    }
}
