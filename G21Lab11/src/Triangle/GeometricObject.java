/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;

/**
 *
 * @author 61010707
 */
public class GeometricObject {
     private String color = "white";
    private boolean isFill = false;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean isFill) {
        this.color = color;
        this.isFill = isFill;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFill(boolean isFill) {
        this.isFill = isFill;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsFill() {
        return isFill;
    }

    public String toString() {
        return "Color = " + this.color + "isFill" + this.isFill;
    }
}
