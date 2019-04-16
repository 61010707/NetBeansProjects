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
public class Faculty extends Employee {

    private String hours;
    private String rank;

    public Faculty() {
        super(null, null, null, null, null, null);
    }

    public Faculty(String name, String address, String phone, String email, String office, String salary,
            String hours, String rank) {
        super(name, address, phone, email, office, salary);
        this.hours = hours;
        this.rank = rank;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "OfficeHours : " + this.hours + "\n Rank : " + this.rank + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
