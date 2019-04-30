/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author DrZin
 */
public class TestLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //testFlowPane(stage);
        //testGridPane(stage);
        testBoarderPane(stage);
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

        Scene scene = new Scene(gridPane, 1080, 720);
        stage.setScene(scene);
        stage.show();
    }

    void testBoarderPane(Stage stage) {
        //set zone to five zone top left center right utton
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10, 10, 10, 10));

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(new Label("Math"));
        hBox.getChildren().add(new Label("Physice"));
        hBox.getChildren().add(new Label("Chem"));
        borderPane.setTop(hBox);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20, 0, 0, 0));
        RadioButton radioButton = new RadioButton("Hello");
        RadioButton radioButton1 = new RadioButton("DrZin");
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton.setToggleGroup(toggleGroup);
        radioButton1.setToggleGroup(toggleGroup);
        vBox.getChildren().addAll(radioButton, radioButton1);
        borderPane.setRight(vBox);

        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);
        Button button = new Button("OK");
        Button button1 = new Button("Cancel");
        hBox1.getChildren().addAll(button, button1);
        borderPane.setBottom(hBox1);

        VBox vBox1 = new VBox();
        vBox1.setSpacing(10);
        vBox1.setPadding(new Insets(20, 0, 0, 0));
        CheckBox checkBox = new CheckBox("Apple");
        CheckBox checkBox1 = new CheckBox("Banana");
        CheckBox checkBox2 = new CheckBox("Coconut");
        vBox1.getChildren().addAll(checkBox, checkBox1, checkBox2);
        borderPane.setLeft(vBox1);

        TextArea textArea = new TextArea();
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10, 10, 10, 10));
        stackPane.getChildren().add(new ScrollPane());
        for (int i = 0; i < 10; i++) {
            textArea.appendText("Hello \t " + i + "\n");
        }
        stackPane.getChildren().add(textArea);
        borderPane.setCenter(stackPane);

        Scene scene = new Scene(borderPane, 250, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
