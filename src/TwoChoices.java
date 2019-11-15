import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class TwoChoices extends Application {
    private int count;
    private Text countText;

    @Override
    public void start(Stage stage)
    {
        count = 50;
        countText = new Text("Count: " + count);

        Button pushDown = new Button("Down");
        pushDown.setOnAction(this::processButtonPressDown);

        Button pushUp = new Button("Up");
        pushUp.setOnAction(this::processButtonPressUp);

        FlowPane pane = new FlowPane(pushDown, countText, pushUp);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: LIGHTSTEELBLUE");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("Count Thing");
        stage.setScene(scene);
        stage.show();
    }

    /*
     * executes when pushUp is clicked increases count by one
     */
    private void processButtonPressUp(ActionEvent event)
    {
        count++;
        countText.setText("Count: " + count);
    }

    /*
        executes when pushDown is clicked decreases count by one
     */
    private void processButtonPressDown(ActionEvent event)
    {
        count--;
        countText.setText("Count: " + count);
    }

}