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
public class Person {

    String name;
    String address;
    String phone;
    String email;

    public Person() {
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "\n Name : " + this.name
                + "\n Address : " + this.address
                + "\n Phone number : " + this.phone
                + "\n Email address : " + this.email
                + "\n ---------------------------------- ";

    }

}
