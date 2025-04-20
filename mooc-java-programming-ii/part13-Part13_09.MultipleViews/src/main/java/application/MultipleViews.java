package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane layoutOne = new BorderPane();
        layoutOne.setTop(new Label("First view!"));

        Button layoutOneBtn = new Button("To the second view!");
        layoutOne.setCenter(layoutOneBtn);

        VBox layoutTwo = new VBox();
        Button layoutTwoBtn = new Button("To the third view!");
        layoutTwo.getChildren().add(layoutTwoBtn);
        layoutTwo.getChildren().add(new Label("Second view!"));

        GridPane layoutThree = new GridPane();
        layoutThree.add(new Label("Third view!"), 0, 0);

        Button layoutThreeBtn = new Button("To the first view!");
        layoutThree.add(layoutThreeBtn, 1, 1);

        Scene first = new Scene(layoutOne);
        Scene second = new Scene(layoutTwo);
        Scene third = new Scene(layoutThree);

        layoutOneBtn.setOnAction((event) -> {
            window.setScene(second);
        });

        layoutTwoBtn.setOnAction((event) -> {
            window.setScene(third);
        });

        layoutThreeBtn.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

}
