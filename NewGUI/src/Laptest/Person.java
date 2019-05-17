/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laptest;

import java.util.Date;

/**
 *
 * @author DrZin
 */
public class Person {

    private String name;
    private String address;
    private String Phone;
    private String email;
    private Date dateCreate;

    public Person(String name, String address, String Phone, String email) {
        this.name = name;
        this.address = address;
        this.Phone = Phone;
        this.email = email;
        dateCreate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", Phone=" + Phone + ", email=" + email + ", dateHired=" + dateCreate + '}';
    }

}
