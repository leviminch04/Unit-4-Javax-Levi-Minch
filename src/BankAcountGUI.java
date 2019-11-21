
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
import javafx.scene.control.TextArea;






public class BankAcountGUI extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }
    private TextArea textWall = new TextArea();
    //textWall.setEditable(false);
    private GridPane gridpane = new GridPane();
    private TextField pinText;
    private TextField nameText;
    private int balance = 0;
    private double interest = 0.039;
    TextField pinAccessor = new TextField();
    private String name;
    private String pin;
    private boolean runSafe = false;

    @Override
    public void start(Stage stage) {
        textWall.setEditable(false);
        Font font = new Font(12);
        nameText = new TextField();
        nameText.setOnAction(this::namePress);
        pinText = new TextField();
        pinText.setOnAction(this::pinPress);

        Button deposit = new Button("Deposit");
        deposit.setOnAction(this::depositPress);

        Button day = new Button("add day");
        day.setOnAction(this::daysPress);

        Button withdraw = new Button("withdraw");
        withdraw.setOnAction(this::withdrawPress);

        Button clear = new Button("Clear");
        clear.setOnAction(this::clearPress);


        Label pinAccessorLabel = new Label("Type in Pin To Access Your Account");

        GridPane pinAccess = new GridPane();
        pinAccess.add(pinAccessorLabel, 0 ,0);
        pinAccess.add(pinAccessor, 1, 0);

        FlowPane buttons = new FlowPane(deposit, day, withdraw, clear);
        buttons.setAlignment(Pos.TOP_RIGHT);
        buttons.setHgap(10);
        buttons.setStyle("-fx-background-color: DIMGREY");

        Label withdrawRequest = new Label("How much do you want to withdraw? ");
        Label depositRequest = new Label("How much do you want to deposit? ");
        TextField withdrawAmount = new TextField();
        TextField depositAmount = new TextField();
        GridPane withdrawDeposit = new GridPane();
        withdrawDeposit.setStyle("-fx-background-color: LIGHTSTEELBLUE");
        withdrawDeposit.add(withdrawRequest, 0, 2);
        withdrawDeposit.add(withdrawAmount, 1, 2);
        withdrawDeposit.add(depositRequest, 0, 1);
        withdrawDeposit.add(depositAmount, 1,1);
        withdrawDeposit.add(pinAccessorLabel, 0,0);
        withdrawDeposit.add(pinAccessor, 1,0);
        pinAccessor.setOnAction(this::pinAccessorPress);

        Label nameLabel = new Label("Account Name ");
        Label pinLabel = new Label("Pin ");

        GridPane createAccount = new GridPane();
        createAccount.setAlignment(Pos.TOP_LEFT);
        createAccount.setStyle("-fx-background-color: DIMGREY");
        createAccount.add(nameLabel, 0, 0);
        createAccount.add(pinLabel, 0, 1);
        createAccount.add(nameText, 1, 0);
        createAccount.add(pinText, 1, 1);

        textWall.setFont(font);
        gridpane.add(textWall, 0, 1);
        gridpane.add(buttons, 1, 0);
        gridpane.add(createAccount, 0, 0);
        gridpane.add(withdrawDeposit, 1, 1);


        Scene scene = new Scene(gridpane, 780, 200);
        stage.setTitle("ATM");
        stage.setScene(scene);
        stage.show();


    }

    private void withdrawPress(javafx.event.ActionEvent actionEvent)
    {
        if(runSafe)
        {
            textWall.setText(textWall.getText() + "withdraw \n");
        }

    }

    private void daysPress(javafx.event.ActionEvent actionEvent)
    {
        if(runSafe)
        {
            textWall.setText(textWall.getText() + "day \n");
        }
    }

    private void depositPress(javafx.event.ActionEvent actionEvent)
    {
        if(runSafe)
        {
            textWall.setText(textWall.getText() + "deposit \n");
        }
    }
    private void namePress(javafx.event.ActionEvent actionEvent)
    {
        name = nameText.getText();
        textWall.setText(textWall.getText() + name + "\n");
    }

    private void pinPress(javafx.event.ActionEvent actionEvent)
    {
        pin = pinText.getText();
    }

    private void clearPress(javafx.event.ActionEvent actionEvent )
    {
        textWall.setText("");
    }

    private void pinAccessorPress(javafx.event.ActionEvent actionEvent)
    {
        String pinAccessorText = pinAccessor.getText();
        if(pinAccessorText.equals(pin))
        {
            runSafe = true;
        }
        if(!pinAccessorText.equals(pin))
        {
            runSafe = false;
        }
    }

}
