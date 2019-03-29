/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTextIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 61010707
 */
public class TestTextIO {

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        File file = new File("test.txt");
        try {
            PrintWriter out = new PrintWriter(file);
            out.print("Hello java");
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        System.out.println(file.exists());

    }
}
