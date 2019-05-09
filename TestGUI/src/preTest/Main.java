/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preTest;

import java.io.File;
import java.io.FileInputStream;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author DrZin
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ArrayList<Loan> loans = new ArrayList<>();
        File file = new File("loans.txt");
        BorderPane borderPane = new BorderPane();
        javafx.scene.control.TextArea textArea = new javafx.scene.control.TextArea();
        borderPane.setCenter(new ScrollPane(textArea));

        TextField tfLoanAmount = new TextField();
        tfLoanAmount.setPrefColumnCount(7);
        TextField tfnumberOfYear = new TextField();
        tfnumberOfYear.setPrefColumnCount(2);
        Button btshowTable = new Button("show Table");

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Loan Amount"), tfLoanAmount, new Label("Number Of Years"), tfnumberOfYear,
                btshowTable);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(5));
        borderPane.setTop(hBox);

        HBox hBox1 = new HBox(20);
        Button btSave = new Button("Save");
        Button btOpen = new Button("Open");
        hBox1.getChildren().addAll(btOpen, btSave);
        hBox1.setPadding(new Insets(5));
        borderPane.setBottom(hBox1);
        hBox1.setAlignment(Pos.CENTER);

        Scene scene = new Scene(borderPane, 480, 250);
        stage.setTitle("Hello loan");
        stage.setScene(scene);
        stage.show();

        btshowTable.setOnAction(e -> {
            textArea.setText("Interest Rate\tMonthly Payment\tTotal Payment\n");
            try {
                double loanAmoumt = Double.parseDouble(tfLoanAmount.getText().trim());
                int numberOfYears = Integer.parseInt(tfnumberOfYear.getText().trim());
                for (double annualInterestRate = 5.0; annualInterestRate <= 10; annualInterestRate += 1.0 / 4) {
                    loans.add(new Loan(annualInterestRate, numberOfYears, loanAmoumt));
                }
                for (int i = 0; i < loans.size(); i++) {
                    textArea.appendText(loans.get(i).toString() + "\n");
                }
            } catch (NumberFormatException ex) {
                textArea.setText(" Input not valid ");
            }
        });

        btSave.setOnAction(e -> {
            textArea.setText(" Save !");
            try {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(loans);
                oos.close();
                fos.close();
            } catch (IOException ex) {
            }
        });

        btOpen.setOnAction(e -> {
            textArea.setText("Interest Rate\tMonthly Payment\tTotal Payment\n");
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ArrayList<Loan> loans1 = (ArrayList<Loan>) ois.readObject();
                for (int i = 0; i < loans1.size(); i++) {
                    textArea.appendText(loans1.get(i).toString() + "\n");
                }
            } catch (IOException ex) {
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
