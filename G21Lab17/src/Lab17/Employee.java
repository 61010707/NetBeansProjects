/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

/**
 *
 * @author DrZin
 */
public class Employee extends Person {

    private int office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phone, String email, int office, double salary) {

        super(name, address, phone, email);
        this.office = office;
        this.salary = this.salary;
        this.dateHired = new MyDate();

    }

    public int getOffice() {
        return office;
    }

    public String getSalary() {
        return String.format("%.2f", salary);
    }

    public MyDate getDateHired() {
        
    }

}
