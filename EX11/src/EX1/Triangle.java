/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

/**
 *
 * @author DrZin
 */
public class Triangle extends Geometric {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(0.0, 0.0, 0.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side1 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "<<===== Triangle : =====>>" 
                + "\n side1 = " + this.side1
                + "\n side 2 = " + this.side2
                + "\n side 3 = " + this.side3
                + "\n Color = " + this.getColor()
                + "\n isFilled = " + this.isIsFilled();
    }

}
