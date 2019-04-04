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
public class Staff extends Employee implements Serializable {

    private String title;

    public Staff( String name, String address, String phone,
            String email, String office, double salary,String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTitle  : " + this.title; //To change body of generated methods, choose Tools | Templates.
    }

}
