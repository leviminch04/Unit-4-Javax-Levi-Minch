
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;

public class BankAcountGUI extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }
    private TextArea textWall = new TextArea(" ");

    @Override
    public void start(Stage stage) {
        Font font = new Font(12);

        Button deposit = new Button("Deposit");
        deposit.setOnAction(this::depositPress);

        Button day = new Button("add day");
        day.setOnAction(this::daysPress);

        Button withdraw = new Button("withdraw");
        withdraw.setOnAction(this::withdrawPress);

        FlowPane buttons = new FlowPane(deposit, day, withdraw);
        buttons.setAlignment(Pos.TOP_RIGHT);
        buttons.setHgap(10);
        buttons.setStyle("-fx-background-color: LIGHTSTEELBLUE");

        FlowPane createAccount = new FlowPane();
        createAccount.setAlignment(Pos.TOP_LEFT);
        createAccount.setHgap(20);
        createAccount.setStyle("-fx-background-color: LIGHTSTEELBLUE");


        textWall.setFont(font);
        GridPane.setHalignment(textWall, HPos.LEFT);

        BorderPane root = new BorderPane();
        root.setTop(buttons);
        root.setBottom(textWall);

        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("ATM");
        stage.setScene(scene);
        stage.show();


    }

    private void withdrawPress(javafx.event.ActionEvent actionEvent)
    {
        textWall.setText(textWall.getText() + "\n withdraw");

    }

    private void daysPress(javafx.event.ActionEvent actionEvent)
    {
        textWall.setText(textWall.getText() + "\n day");
    }

    private void depositPress(javafx.event.ActionEvent actionEvent)
    {
        textWall.setText(textWall.getText() + "\n deposit");
    }

}
