/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author DrZin
 */
public class Employee extends Person {

    String office;
    String salary;
    MyDate date;

    public Employee(String name, String address, String phone, String email, String office, String salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date = new MyDate();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
    }

    public void setDate(MyDate date) {
        this.date = new MyDate();
    }

    @Override
    public String toString() {
        return " Office : " + this.office
                + "\n Salary : " + this.getSalary()
                + "\n Date Hired : " + this.getDate()
                + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
