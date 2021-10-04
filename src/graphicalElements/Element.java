package graphicalElements;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Element extends Application{
    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        // create a labels
        Label label1 = new Label("Name");
        Label label2 = new Label("ID");
        Label label3 = new Label("Address");
        Label label4 = new Label("Phone Number");
        // create a Grid pane
        GridPane r = new GridPane();
        //Add the labels to the stack panes
        r.add(label1,0,0);
        r.add(label2,0,2);
        r.add(label3,0,4);
        r.add(label4,0,6);
        // create a scene
        Scene sc = new Scene(r, 200, 200);
        // set the scene
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}