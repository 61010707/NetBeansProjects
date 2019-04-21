/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex07;

/**
 *
 * @author DrZin
 */
public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
    }

    public Square(double side)
    {
        this.side = side;
    }
    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String howToColor() {
        return "All side is " + getColor();
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}
