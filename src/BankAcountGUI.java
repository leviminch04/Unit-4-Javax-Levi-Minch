
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;





public class BankAcountGUI extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }
    private Label textWall = new Label(" ");
    private GridPane gridpane = new GridPane();
    private TextField pin;
    private TextField name;


    @Override
    public void start(Stage stage) {
        Font font = new Font(12);
        name = new TextField();
        pin = new TextField();
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

        Label nameLabel = new Label("Account Name ");
        Label pinLabel = new Label("Pin ");

        GridPane createAccount = new GridPane();
        createAccount.setAlignment(Pos.TOP_LEFT);
        createAccount.setStyle("-fx-background-color: LIGHTSTEELBLUE");
        createAccount.add(nameLabel, 0, 0);
        createAccount.add(pinLabel, 0, 1);
        createAccount.add(name, 1, 0);
        createAccount.add(pin, 1, 1);

        textWall.setFont(font);
        gridpane.add(textWall, 0, 1);
        gridpane.add(buttons, 1, 0);
        gridpane.add(createAccount, 0, 0);


        Scene scene = new Scene(gridpane, 650, 500);
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
