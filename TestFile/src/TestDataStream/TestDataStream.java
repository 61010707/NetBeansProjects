/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputMap;

/**
 *
 * @author DrZin
 */
public class TestDataStream {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TestData.dat");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream data = new DataOutputStream(fos);

        try {
            data.flush();
            data.write(125);
            data.write(2500);
            data.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        
        try {
            System.out.println(dis.read());
            System.out.println(dis.readByte());
            
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
