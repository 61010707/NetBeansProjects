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
public class Person implements Serializable{

    private String name;
    private String address;
    private String phone;
    private String email;

    public Person() {
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\nName : " + this.name
                + "\nAddress : " + this.address
                + "\nPhone number : " + this.phone
                + "\nEmail address : " + this.email;
    }

}
