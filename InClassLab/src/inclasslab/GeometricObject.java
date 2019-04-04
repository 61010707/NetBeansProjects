/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasslab;

import java.util.Date;

/**
 *
 * @author 61010707
 */
public abstract class GeometricObject {

    private String color;
    private boolean isFilled;
    private Date dateCreated;

    public GeometricObject() {
        this("white", false);
    }

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        this.dateCreated = new Date();
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

}
