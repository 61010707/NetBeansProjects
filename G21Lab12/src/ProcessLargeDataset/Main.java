/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessLargeDataset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();
        String line = "";
        FileReader fileReader = new FileReader("Salary.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split(" ");
            double salary = Double.parseDouble(str[3]);
            String rank = str[2];
            process(assistant, associate, full, rank, salary);
        }
        bufferedReader.close();

        String totalAssistant = total(assistant);
        String totalAssociate = total(associate);
        String totalFull = total(full);

        BigDecimal totalFaculty = new BigDecimal(totalAssistant);
        totalFaculty = totalFaculty.add(new BigDecimal(totalAssociate));
        totalFaculty = totalFaculty.add(new BigDecimal(totalFull));

        //String totalFaculty = (totalAssistant + totalAssociate + totalFull);
        //Display
        System.out.println("\n   Total salary");
        System.out.println("----------------------");
        System.out.printf("Assistant professors: $ %s\n", totalAssistant);
        System.out.printf("Associate professors: $ %s\n", totalAssociate);
        System.out.printf("Full professors:      $ %s\n", totalFull);
        System.out.printf("All faculty:          $ %s\n", totalFaculty);

        int assistantSize = assistant.size();
        String assStr = Integer.toString(assistantSize);

        int associateSize = associate.size();
        String assoStr = Integer.toString(associateSize);

        int fullSize = full.size();
        String fullStr = Integer.toString(fullSize);

        int totalFacultySize = assistantSize + associateSize + fullSize;
        String totalFacultyStr = Integer.toString(totalFacultySize);

        System.out.println("\n   Average salary");
        System.out.println("---------------------");
        System.out.printf("Assistant professors: $ %s\n", (new BigDecimal(totalAssistant)).divide(new BigDecimal(assStr), 2, BigDecimal.ROUND_DOWN));
        System.out.printf("Associate professors: $ %s\n", (new BigDecimal(totalAssociate)).divide(new BigDecimal(assoStr), 2, BigDecimal.ROUND_DOWN));
        System.out.printf("Full professors:      $ %s\n", (new BigDecimal(totalFull)).divide(new BigDecimal(fullStr), 2, BigDecimal.ROUND_DOWN));
        System.out.printf("All faculty:          $ %s\n", totalFaculty.divide(new BigDecimal(totalFacultyStr), 2, BigDecimal.ROUND_DOWN));

    }

    public static String total(ArrayList<Double> list) {
        BigDecimal total = new BigDecimal("0.0");
        for (int i = 0; i < list.size(); i++) {
            total = total.add(new BigDecimal(list.get(i)));
        }

        return (total.setScale(2, BigDecimal.ROUND_DOWN)).toString();
    }

    public static void process(ArrayList<Double> assistant, ArrayList<Double> associate, ArrayList<Double> full, String rank, double salary) {
        switch (rank) {
            case "assistant":
                assistant.add(salary);
                break;
            case "associate":
                associate.add(salary);
                break;
            case "full":
                full.add(salary);
                break;
            default:
                break;
        }

    }
}
