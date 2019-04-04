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
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
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

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double area = 0.0, p = 0.0;
        p = this.getPerimeter() / 2;
        area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle side1: " + this.side1 + " side2 " + this.side2 + " side3 " + this.side3;
    }
}
