import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class BankAcountGUI extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button deposit = new Button("Deposit");
        deposit.setOnAction(this::depositPress);

        FlowPane buttons = new FlowPane(deposit);
        buttons.setAlignment(Pos.TOP_RIGHT);
        buttons.setHgap(10);
        buttons.setStyle("-fx-background-color: LIGHTSTEELBLUE");

        Scene scene = new Scene(buttons, 300, 300);
        stage.setTitle("ATM");
        stage.setScene(scene);
        stage.show();

    }

    private void depositPress(javafx.event.ActionEvent actionEvent)
    {

    }
}
