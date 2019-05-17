/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laptest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author DrZin
 */
public class Main extends Application {

    private String selectType;

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        //Top
        HBox hBox = new HBox(10);
        TextField tfInputFileName = new TextField();
        Button btDisplay = new Button("Display");
        Label lbInputFileName = new Label("Input File Name");
        hBox.getChildren().addAll(lbInputFileName, tfInputFileName, btDisplay);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10, 0, 0, 0));
        pane.setTop(hBox);
        //Center
        TextArea textArea = new TextArea();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(new ScrollPane(), textArea);
        stackPane.setAlignment(Pos.CENTER);
        stackPane.setPadding(new Insets(10, 20, 0, 0));
        pane.setCenter(stackPane);

        //Left
        VBox vBox = new VBox(10);
        RadioButton rbStudent = new RadioButton("Student");
        RadioButton rbFaculty = new RadioButton("Faculty");
        RadioButton rbStaff = new RadioButton("Faculty");
        Label lbFilters = new Label("Filters");
        vBox.getChildren().addAll(lbFilters, rbStudent, rbFaculty, rbStaff);
        vBox.setPadding(new Insets(10, 10, 0, 10));
        pane.setLeft(vBox);

        //bottom
        HBox hBox1 = new HBox(10);
        hBox1.setAlignment(Pos.CENTER);
        Button btReset = new Button("Reset");
        hBox1.getChildren().add(btReset);
        hBox1.setPadding(new Insets(10));
        pane.setBottom(hBox1);

        //Setting        
        Scene scence = new Scene(pane, 480, 250);
        stage.setScene(scence);
        stage.show();
        stage.setTitle("Laptest2");

        rbStudent.setOnAction(e -> {
            selectType = "Students";

        });

        rbFaculty.setOnAction(e -> {
            selectType = "Faculty";
        });

        rbStaff.setOnAction(e -> {
            selectType = "Staff";
        });

        btReset.setOnAction(e -> {
            textArea.setText("");
        });

        btDisplay.setOnAction(e -> {
            String fileName = tfInputFileName.getText();

            try {
                Scanner reader = new Scanner(new File(fileName));
                while (reader.hasNextLine()) {
                    textArea.setText(getData(reader.nextLine(), selectType));
                }
            } catch (FileNotFoundException ex) {
                textArea.setText("File name not valid");
            }
        });

    }

    private static String getData(String file, String selectType) {
        if (file.contains(selectType)) {
            return file;
        } else {
            return file;
        }

    }

    public static void main(String[] args) throws IOException {
        Students students = new Students("Pasawee Laearun", "kake1", "0985626152", "61010707@kmitl.ac.th", Students.FRESHLY);
        Faculty faculty = new Faculty("ha jhon", "kake1", "0985626152", "61010707@kmitl.ac.th", 1245656, "kmitl", "mon-tue", Faculty.PROFRESSOR);
        Staff staff = new Staff("jonathan smith", "kake2", "0985626152", "61010656@kmitl.ac.th", "staff book", 12356, "kmitl");

        File file = new File("data.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(students.toString() + "\r\n");
        fw.write(faculty.toString() + "\r\n");
        fw.write(staff.toString() + "\r\n");
        fw.flush();
        fw.close();
        launch(args);
    }
}
