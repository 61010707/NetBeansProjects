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
public class Staff extends Employee {

    private String staff;

    public Staff(String name, String address, String Phone, String email, String staff, double salary, String office) {
        super(salary, office, name, address, Phone, email);
        this.staff = staff;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() + "staff=" + staff + '}';
    }

}
