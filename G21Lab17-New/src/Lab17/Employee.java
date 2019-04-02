/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

import java.io.Serializable;

/**
 *
 * @author DrZin
 */
public class Employee extends Person implements Serializable{

    private String office;
    private double salary;
    private MyDate date;

    public Employee(String name, String address, String phone,
            String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date = new MyDate();
    }

    public String getOffice() {
        return office;
    }

    public String getSalary() {
        return String.format("%.2f", this.salary);
    }

    public String getDateHired() {
        return date.getMonth() + "/" + date.getDay()
                + "/" + date.getYear();
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate(MyDate date) {
        this.date = new MyDate();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nOffice: " + office
                + "\nSalary: $" + getSalary()
                + "\nDate hired: " + getDateHired();
    }

}
