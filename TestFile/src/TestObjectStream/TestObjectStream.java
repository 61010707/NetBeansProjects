/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjectStream;

import java.io.*;
import java.util.*;

/**
 *
 * @author DrZin
 */
public class TestObjectStream {

    public static void main(String[] args) {
        try {
            demo1();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static void demo1() throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("TestObject.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Date());
        oos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        ois.close();

    }
}
