/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author 61010707
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width;
    private double height;
    
    public Rectangle() {
        
    }
    
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
        
    }
    
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return this.width * this.height;
    }
    
    @Override
    public double getPerimeter() {
        
        return 2 * (this.width * this.height);
        
    }
    
    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    @Override
    public boolean equals(Object o) {
        return this.compareTo((Rectangle) o) == 0;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        return hash;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
    
}
