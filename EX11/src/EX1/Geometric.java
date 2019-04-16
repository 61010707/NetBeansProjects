/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

/**
 *
 * @author DrZin
 */
public class Geometric {

    String color = "";
    boolean isFilled = false;

    public Geometric() {
        this("Unknown", false);
    }

    public Geometric(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

}
