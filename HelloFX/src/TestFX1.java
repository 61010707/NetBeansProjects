
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DrZin
 */
public class TestFX1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label laName = new Label("DR.Zin");
        Pane pane = new Pane();
        pane.getChildren().add(laName);
        Scene scene = new Scene(pane, 250, 250);
       
        stage.setTitle("HelloFx");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
