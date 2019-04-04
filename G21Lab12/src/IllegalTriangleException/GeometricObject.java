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
public abstract class GeometricObject {

    private String coloString;
    private boolean filled;
    private Date dateCreted;

    public GeometricObject() {
    }

    public GeometricObject(String coloString, boolean filled) {
        this.coloString = coloString;
        this.filled = filled;
        this.dateCreted = new Date();
    }

    public String getColoString() {
        return coloString;
    }

    public void setColoString(String coloString) {
        this.coloString = coloString;
    }

    public Date getDateCreted() {
        return dateCreted;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "color : " + this.coloString + " isFilled : " + this.filled + " DateCrete : " + this.dateCreted;
    }

}
