/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chepter16;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.plaf.ColorUIResource;
import javafx.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;

/**
 *
 * @author DrZin
 */
public class TestEvent extends Application {

    CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().addAll(btEnlarge, btShrink);
        borderPane.setBottom(hBox);
        borderPane.setCenter(circlePane);
        Scene scene = new Scene(borderPane, 250, 250);
        stage.setScene(scene);
        stage.show();
        btEnlarge.setOnAction(e ->circlePane.enlarge());
        btShrink.setOnAction(e->circlePane.shrink());

    }

    class CirclePane extends StackPane {

        private Circle circle = new Circle(20);

        public CirclePane() {
            circle.setFill(Color.CYAN);
            circle.setStroke(Color.BLACK);
            getChildren().add(circle);

        }

        void enlarge() {
            circle.setRadius(circle.getRadius() + 2);
        }

        void shrink() {
            circle.setRadius(circle.getRadius() - 2);
        }

    }

    class EnlargeHandler implements EventHandler<ActionEvent> {

        public EnlargeHandler() {
        }

        @Override
        public void handle(ActionEvent t) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            circlePane.enlarge();
        }

    }

    class ShrinkHandler implements EventHandler<ActionEvent> {

        public ShrinkHandler() {
        }

        @Override
        public void handle(ActionEvent t) {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            circlePane.shrink();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}
