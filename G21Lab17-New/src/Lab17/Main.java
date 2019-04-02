/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("Lab17Object");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Person("Brazil", "1999 downtown ", "0985626152", "61010707@kmitl.ac.th"));
        oos.writeObject(new Student("nieve", "1998 downtown", "098652135", "61010707@kmitl.ac.th", Student.SENIOR));
        oos.writeObject(new Employee("fai", "1990 downTown", "098542842", "61010787@kmitl.ac.th", "tamala", 30006));
        oos.writeObject(new Faculty("Time ", "199 5 wallstreet", "84554854815", "Hallaa", "tamalo", 695220, "4pm to 1 am", "Mid-high"));
        oos.writeObject(new Staff("Tomradder", "1998 downtown ", "5894515", "sdkjfkjdsfkj@gmail.ac", "tamolao", 4512151, "Assittant"));
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        for (int i = 0; i < 5; i++) {
            System.out.println(ois.readObject().toString());
        }
        ois.close();

    }
}
