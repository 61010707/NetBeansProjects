/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10;

/**
 *
 * @author DrZin
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getheight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setheight(double height) {
        this.height = height;
    }

    @Override
    /**
     * Return area
     */
    public double getArea() {
        return width * height;
    }

    @Override
    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * (width * height);
    }

    @Override
    public int compareTo(Rectangle o) {
       if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    public boolean equals(Rectangle obj) {
      return this.compareTo((Rectangle)obj) == 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "Area" + getArea()+'}';
    }
    

}
