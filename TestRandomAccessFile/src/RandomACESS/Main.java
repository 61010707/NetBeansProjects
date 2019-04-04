/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomACESS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("test.dat");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.writeChars("Brazil");
        raf.close();
        
        RandomAccessFile input = new RandomAccessFile(file, "r");
        System.out.println(input.readChar());
        raf.close();
        
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());            
            
        }
        scanner.close();
    }
}
