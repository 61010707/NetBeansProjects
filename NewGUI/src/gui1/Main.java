/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author DrZin
 */
public class Main extends Application {

    private double weight = 480;
    private double height = 250;

    @Override
    public void start(Stage stage) throws Exception {
        // Setting
        BorderPane bp = new BorderPane();
        Scene scene = new Scene(bp, weight, height);
        ArrayList<Loan> loans = new ArrayList<>();
        File file = new File("Loan.txt");
        //Header
        TextField tfLoanAmount = new TextField();
        TextField tfYears = new TextField();
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        tfLoanAmount.setPrefColumnCount(7);
        tfYears.setPrefColumnCount(2);
        Button showTable = new Button("show Table");
        hBox.setPadding(new Insets(5));
        hBox.getChildren().addAll(new Label("Loan Amount"), tfLoanAmount, new Label("Number of Year"), tfYears, showTable);
        bp.setTop(hBox);

        //Center
        TextArea textArea = new TextArea();
        StackPane sp = new StackPane();
        sp.setPadding(new Insets(10));
        sp.getChildren().addAll(new ScrollPane(), textArea);
        bp.setCenter(sp);

        //bottom
        HBox hBox1 = new HBox(20);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setPadding(new Insets(5));
        Button save = new Button("Save");
        Button Open = new Button("Open");
        hBox1.getChildren().addAll(Open, save);
        bp.setBottom(hBox1);
        //Stage setting 
        stage.setTitle("Java GUI");
        stage.setScene(scene);
        stage.show();

        //button setting
        //show table
        showTable.setOnAction(e -> {

            textArea.setText("Interest Rate\tMonthly Payment\tTotal Payment\n");
            try {
                double loanAmount = Double.parseDouble(tfLoanAmount.getText().trim());
                int numberOfYear = Integer.parseInt(tfYears.getText().trim());
                for (double annualInterest = 5.0; annualInterest <= 10; annualInterest += 1.0 / 4) {
                    loans.add(new Loan(annualInterest, numberOfYear, loanAmount));
                }
                for (int i = 0; i < loans.size(); i++) {
                    textArea.appendText(loans.get(i).toString() + "\n");
                }
            } catch (NumberFormatException ex) {
                textArea.setText(" Input not valid ");
            }
        });

        save.setOnAction(e -> {
            try {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(loans);
                oos.close();
                fos.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        Open.setOnAction(e -> {
            textArea.setText("Interest Rate\tMonthly Payment\tTotal Payment from file " + file.getName() + "\n");
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ArrayList<Loan> loans1 = (ArrayList<Loan>) ois.readObject();
                for (int i = 0; i < loans1.size(); i++) {
                    textArea.appendText(loans1.get(i).toString() + "\n");
                }
            } catch (IOException | ClassNotFoundException ex) {
            }
        });
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
