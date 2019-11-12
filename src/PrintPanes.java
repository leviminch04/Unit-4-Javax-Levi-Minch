import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class PrintPanes extends Application {
    private TextField name;
    private TextField age;
    private TextField color;
    private TextField hobby;

    @Override
    public void start(Stage stage)
    {
        Font font = new Font(20);
        Label nameInput = new Label("name:");
        nameInput.setFont(font);
        GridPane.setHalignment(nameInput, HPos.RIGHT);

        Label ageInput = new Label("age");
        ageInput.setFont(font);
        GridPane.setHalignment(ageInput, HPos.RIGHT);




    }
}
