/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        Triangle r1 = new Triangle(12, 12, 12, "white", true);
        Triangle r2 = new Triangle(12, 12, 12, "Red", true);
        Triangle r3 = new Triangle(15, 16, 15, "purple", true);

        System.out.println("R1 Area: " + r1.getArea());
        System.out.println("R2 Area: " + r2.getArea());
        System.out.println("R3 Area: " + r3.getArea());

        System.out.println("r1 and r2 is " + r1.equals(r2));
        System.out.println("r1 and r3 is " + r1.equals(r3));

    }

}
