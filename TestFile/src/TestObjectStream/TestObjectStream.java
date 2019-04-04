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
            demo2();
        } catch (IOException | ClassNotFoundException e) {
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

    static void demo2() throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("TestObject2.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Circle(15));
        oos.writeObject(new Circle(16));
        oos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Circle c3 ;
        System.out.println(ois.readObject().toString());
        System.out.println(ois.readObject().toString());
        ois.close();

    }

}

class Circle implements Serializable {

    private double radius;
    private static int numberOfObject;
    private transient B b = new B();

    public Circle() {
        this(5.5);
       
    }

    public Circle(double radius) {
        this.b = new B();
        this.radius = radius;
        numberOfObject++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle " + this.radius + "number" + numberOfObject;
    }

}

class B {
}
