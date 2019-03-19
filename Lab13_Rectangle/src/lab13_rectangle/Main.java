/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_rectangle;

/**
 *
 * @author 61010707
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangle r1 = new Rectangle(1, 5, "white", true);
        Rectangle r2 = new Rectangle(5, 5, "white", false);
        Rectangle r3 = new Rectangle(5, 1, "Red  ", true);
        
        System.out.println("R1 Area: " + r1.getArea());
        System.out.println("R2 Area: " + r2.getArea());
        System.out.println("R3 Area: " + r3.getArea());
        
        System.out.println("r1 and r2 is " + r1.equals(r2) );
        System.out.println("r1 and r3 is " + r1.equals(r3));
        
    }

}
