package application;

import application.logic.SavingsCalculator;
import application.ui.SavingsCalculatorUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    private SavingsCalculator calculatorLogic;

    public SavingsCalculatorApplication() {
        this.calculatorLogic = new SavingsCalculator();
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        SavingsCalculatorUI ui = new SavingsCalculatorUI(calculatorLogic);

        window.setTitle("Savings calculator application");
        window.setScene(new Scene(ui.getMainLayout(), 800, 600));
        window.show();
    }
}
