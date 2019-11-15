import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class CircleRadiusClient extends Application {

    public void start(Stage stage)
    {
        Scene scene = new Scene(new CircleRadius(), 300, 300);

        stage.setTitle("Circle Thing");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
