/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IllegalTriangleException;

/**
 *
 * @author 61010707
 */
public class IllegalTriangleException extends Exception {

    private double side1;
    private double side2;
    private double side3;
    
    public IllegalTriangleException(double side1, double side2, double side3) {
        super(" Illegal " + side1 + " " + side2 + " " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1() {
        return side1;
    }
    
    public double getSide2() {
        return side2;
    }
    
    public double getSide3() {
        return side3;
    }
    
}
