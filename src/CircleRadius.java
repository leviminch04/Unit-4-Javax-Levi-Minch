import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.shape.Circle;


public class CircleRadius extends GridPane {
    private TextField radius;
    private String radiusCircleString;
    private double radiusCircle;

    private Circle circle = new Circle();

    public CircleRadius()
    {
        Font font = new Font(20);
        radius = new TextField();
        radius.setFont(font);
        radius.setPrefWidth(70);
        radius.setAlignment(Pos.CENTER);
        radius.setOnAction(this::processReturn);

        circle.setCenterX(100f);
        circle.setCenterY(100f);
        circle.setRadius(0f);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: LIGHTSTEELBLUE");

        add(radius, 1, 0);
    }

    public void processReturn(ActionEvent event)
    {
        radiusCircleString = radius.getText();
        radiusCircle = Double.parseDouble(radiusCircleString);

        circle.setRadius(radiusCircle);
    }
}
