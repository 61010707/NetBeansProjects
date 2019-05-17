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
public class Employee extends Person {

    private double salary;
    private String office;

    public Employee(double salary, String office, String name, String address, String Phone, String email) {
        super(name, address, Phone, email);
        this.salary = salary;
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "salary=" + salary + ", office=" + office + '}';
    }

}
