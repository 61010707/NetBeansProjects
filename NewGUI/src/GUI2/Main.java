/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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

    @Override
    public void start(Stage stage) throws Exception {
        //Basic setting
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 480, 250);
        File file = new File("NewGui.txt");
        ArrayList<Loan> loans = new ArrayList<>();
        stage.setScene(scene);
        stage.setTitle("GUI java");
        stage.show();

        //Top
        HBox hBox = new HBox(10);
        TextField tfLoan = new TextField();
        TextField tfYears = new TextField();
        Button btShow = new Button("Show Table");
        tfLoan.setPrefColumnCount(7);
        tfYears.setPrefColumnCount(3);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().addAll(new Label("Loan Amount "), tfLoan, new Label("number of years"), tfYears, btShow);
        pane.setTop(hBox);

        //Center
        TextArea ta = new TextArea();
        StackPane sp = new StackPane();
        sp.getChildren().addAll(new ScrollPane(), ta);
        pane.setCenter(sp);
        //Buttom
        Button btSave = new Button("Save");
        Button btOpen = new Button("Open");
        HBox hBox1 = new HBox(5);
        hBox1.getChildren().addAll(btOpen, btSave);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setPadding(new Insets(5));
        pane.setBottom(hBox1);
        //Left
        RadioButton rbInter = new RadioButton("Interest Rate");
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10));
        vBox.getChildren().add(rbInter);
        pane.setLeft(vBox);

        btShow.setOnAction(e -> {
            ta.setText("Interest Rate\t\tMonthlyPay\t\tTotal Pay " + "\n");
            try {
                double loanAmount = Double.parseDouble(tfLoan.getText().trim());
                int numberOfYears = Integer.parseInt(tfYears.getText().trim());
                for (double annualInterestRate = 5.0; annualInterestRate <= 10; annualInterestRate += 1.0 / 4) {
                    loans.add(new Loan(annualInterestRate, numberOfYears, loanAmount));
                }
                for (int i = 0; i < loans.size(); i++) {
                    ta.appendText(loans.get(i).toString() + "\n");

                }
            } catch (NumberFormatException ex) {
            }
        });

        btSave.setOnAction(e -> {
            try {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(loans);
                oos.flush();
                oos.close();
                fos.close();
                ta.appendText("Save Complete");
            } catch (IOException ex) {
                ta.setText("Save not complete" + ex);
            }
        });

        btOpen.setOnAction(e -> {
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ArrayList<Loan> loans1 = (ArrayList<Loan>) ois.readObject();
                ois.close();
                fis.close();
                ta.setText("Interest Rate\t\tMonthlyPay\tTotal Pay  from file " + file.getName() + "\n");
                for (int i = 0; i < loans1.size(); i++) {
                    ta.appendText(loans1.get(i).toString() + "\n");
                }
            } catch (IOException | ClassNotFoundException ex) {
            }
        });

        rbInter.setOnAction(e -> {
            ta.setText("Interest Rate");
            for (int i = 0; i < loans.size(); i++) {
                ta.appendText("");
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}
