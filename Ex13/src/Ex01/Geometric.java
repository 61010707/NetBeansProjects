/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author DrZin
 */
public abstract class Geometric {

    private String color = "";
    private boolean filled = false;

    public Geometric() {
        this("White", false);
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
        
    }

    @Override
    public String toString() {
        return "Color : " + this.color + " \nFilled : " + this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
