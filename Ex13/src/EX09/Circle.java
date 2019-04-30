/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX09;

/**
 *
 * @author DrZin
 */
public class Circle extends GeometricObject implements Comparable<Circle>{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius;
    }


    public int compareTo(Circle obj) {

        return this.getArea() > obj.getArea() ? 1 : this.getArea() < obj.getArea() ? -1 : 0;
    }

    public boolean equals(Circle obj) {
        return this.compareTo(obj) == 0 ? true : false;
    }

}
