/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtriangle;

/**
 *
 * @author 61010707
 */
public class GeometricObject {

    private String color;
    private Boolean filled;

    public GeometricObject() {

    }

    public GeometricObject(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject color : " + this.getColor() + " filled : " + this.filled;

    }
}
