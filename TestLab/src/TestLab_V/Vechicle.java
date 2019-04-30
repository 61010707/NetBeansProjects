/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLab_V;

/**
 *
 * @author DrZin
 */
public abstract class Vechicle implements Comparable<Vechicle> {

    private String name;
    private String color;
    private int id;

    public Vechicle(String name, String color, int id) {
        this.name = name;
        this.color = color;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vechicle{" + "name=" + name + ", color=" + color + ", id=" + id + '}';
    }

    public abstract double calculateTax();

    public abstract void payTax();

    public abstract double getTax();

    @Override
    public int compareTo(Vechicle vechicle) {
        return this.getTax() > vechicle.getTax() ? 1 : this.getTax() < vechicle.getTax() ? -1 : 0;
    }

    public static int getCompare(Vechicle obj, Vechicle obj1) {
        return obj.compareTo(obj1);
    }

}
