/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author DrZin
 */
public class TestLayout extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //testFlowPane(stage);
        testGridPane(stage);
    }
    
    void testFlowPane(Stage stage) {
        stage.setTitle("Hellofx");
        //Flow pane is a paper size same as scene when add label will add from lect -> right top -> down 
        FlowPane flowPane = new FlowPane();
        //set space from edge 
        flowPane.setPadding(new Insets(10, 10, 10, 10));

        //set Horizon gap
        flowPane.setHgap(5);
        //set vertical gap 
        flowPane.setVgap(5);
        
        Label label = new Label("Hello");
        Label label1 = new Label("Dr.Zin");
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(label1);
        Scene scene = new Scene(flowPane, 250, 250);
        stage.setScene(scene);
        stage.show();
    }
    
    void testGridPane(Stage stage) {
        GridPane gridPane = new GridPane();
        Label label = new Label("Hello");
        Label label1 = new Label("DrZin");
        Button button = new Button("Hello");
        Button button1 = new Button("Byw Bye");
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(label, 0, 0);
        gridPane.add(button, 1, 0);
        gridPane.add(label1, 0, 1);
        gridPane.add(button1, 1, 1);
        Scene scene = new Scene(gridPane, 250, 250);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
