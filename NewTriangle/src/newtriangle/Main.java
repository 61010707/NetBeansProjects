/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtriangle;

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
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(21.0, 22.0, 23.0);
        triangle1.setColor("white");
        triangle1.setFilled(true);
        System.out.println(triangle.toString() + " " + triangle1.toString()+triangle1.getFilled()+triangle1.getColor());

    }

}
