/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;

/**
 *
 * @author 61010707
 */
public class Triangle extends GeometricObject{

    private double side1 = 0.0;
    private double side2 = 0.0;
    private double side3 = 0.0;

    public Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
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

    public double getArea() {
        double area;
        double s;
        s = (this.side1 + this.side2 + this.side3) / 2;
        area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return area;
    }

    public double getPerimeter() {

        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Tiangle : side = " + this.side1 + " \nside2  = " + this.side2 + " ]nside 3 = " + this.side3;
    }
}
