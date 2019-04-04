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
public class Faculty extends Employee implements Serializable {

    private String officeHours;
    private String rank;

    public Faculty(String name, String address,
            String phone, String email, String office, double salary,
            String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nOffice hours: " + officeHours
                + "\nRank: " + rank; //To change body of generated methods, choose Tools | Templates.
    }

}
