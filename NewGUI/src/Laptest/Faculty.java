/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laptest;

/**
 *
 * @author DrZin
 */
public class Faculty extends Employee {

    public static int INSTRUCTOR = 1;
    public static int ASSISTANT_PROFRESSOR = 2;
    public static int ASSOCIATE_PROFRESSOR = 3;
    public static int PROFRESSOR = 4;
    private int rank;
    private String schedule;

    public Faculty(String name, String address, String Phone, String email, double salary, String office, String schedule, int rank) {
        super(salary, office, name, address, Phone, email);
        this.rank = rank;
        this.schedule = schedule;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + super.toString() + "rank=" + rank + '}';
    }

}
