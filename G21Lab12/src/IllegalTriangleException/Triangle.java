/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************
 * Triangle * --------------------------------------------------------* -side1:
 * double * -side2: double * -side3: double * +Triangle() * +Triangle(side1:
 * double, side2: double, side3: double) * +getSide1(): double * +getSide2():
 * double * +getSide3(): double * +getArea(): double * +getPerimeter(): double *
 * +toString(): String *
 ******************************************************** */
package IllegalTriangleException;

/**
 *
 * @author 61010707
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = side2 = side3 = 0.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("error");
            throw new IllegalTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
                + "\n Area : " + this.getArea()
                + "\n perimeter : " + this.getPerimeter()
                + "\n color : " + this.getColor()
                + "\n filled : " + this.isFilled();
    }

}
