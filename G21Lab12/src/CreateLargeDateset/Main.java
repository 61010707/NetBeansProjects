/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateLargeDateset;

import java.io.*;

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");

        String rank = "";
        double salary;
        try (PrintWriter output = new PrintWriter(file);) {
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName" + i + " LastName" + i);
                rank = getRank();
                salary = getSalary(rank);
                output.printf(" " + rank + " %.2f\n", salary);

            }
        }
    }

    public static String getRank() {
        String[] rank = {"assistant", "associate", "full"};
        return rank[(int) (Math.random() * rank.length)];
    }

    public static double getSalary(String rank) {
        switch (rank) {
            case "assistant":
                return 50000 + (double) (Math.random() * 30001);
            case "associate":
                return 60000 + (double) (Math.random() * 50001);
            default:
                return 75000 + (double) (Math.random() * 55001);
        }
    }
}
