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
public class Students extends Person {

    public static int FRESHLY = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;
    private int status;

    public Students(String name, String address, String Phone, String email, int status) {
        super(name, address, Phone, email);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "FRESHLY";
            case 2:
                return "SOPHOMORE";
            case 3:
                return "JUNIOR";
            case 4:
                return "SENIOR";
            default:
                return "Unknown";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Students{" + super.toString() + "status=" + getStatus() + '}';
    }

}
