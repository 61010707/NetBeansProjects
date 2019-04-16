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
public class Student extends Person {

    private int status;

    public static enum Status {
        Freshman, Sophomore, Junior, Senior
    };

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (this.status + 1) {
            case 1:
                return "Freshman";
            case 2:
                return "Sophomore";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return " Status : " + this.getStatus() + super.toString()
                ; //To change body of generated methods, choose Tools | Templates.
    }

}
