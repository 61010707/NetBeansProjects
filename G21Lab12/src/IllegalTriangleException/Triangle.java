/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IllegalTriangleException;

import java.util.Date;

/**
 *
 * @author 61010707
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this(0.0, 0.0, 0.0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException(side1, side2, side3);
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

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

    @Override
    public String getColoString() {
        return super.getColoString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getDateCreted() {
        return super.getDateCreted(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3
                + "\nArea : " + getArea()
                + "\nPerimeter : " + getPerimeter()
                + "\nColor : " + getColoString()
                + "\nIsfilled : " + isFilled()
                + "\nDate Created : " + getDateCreted();
    }

}
