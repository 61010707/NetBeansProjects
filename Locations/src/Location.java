/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
public class Location {

    private int rows = 0;
    private int colums = 0;
    private double maxValue = 0.0;

    public Location() {
    }

    public Location(int rows, int colums, double maxValue) {
        this.rows = rows;
        this.colums = colums;
        this.maxValue = maxValue;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public int getColums() {
        return colums;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public int getRows() {
        return rows;
    }

   
}
