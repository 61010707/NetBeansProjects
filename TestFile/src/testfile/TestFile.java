/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DrZin
 */
public class TestFile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Hello world");
        demo2();
    }

    static void demo1() {
    }

    static void demo2() throws FileNotFoundException {
        File file = new File("TestBinary.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        byte[] b = new byte[]{1, 2, 3};
        try {
            outputStream.write(125);
            outputStream.flush();
            outputStream.write('A');
            outputStream.write(b);
            outputStream.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }

        FileInputStream input = new FileInputStream(file);
        try {

            System.out.println(input.read());
            System.out.println((char) input.read());
            byte[] read = new byte[3];
            input.read(read);
            for (byte c : read) {
                System.out.println(c);

            }
            input.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
