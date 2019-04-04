/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_rectangle;

import java.util.Date;

/**
 *
 * @author 61010707
 */
public abstract class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Created on " + this.dateCreated + " \ncolor: " + this.color + " and filled: " + this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
