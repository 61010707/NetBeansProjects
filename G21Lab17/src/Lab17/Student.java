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
public class Student extends Person {

    private int status;
    private final static int FRESHMAN = 1;
    private final static int SOPHOMORE = 2;
    private final static int JUNIOR = 3;
    private final static int SENIOR = 4;

    public Student() {
    }

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        if (status >= 1 || status <= 4) {
            this.status = status;
        }
        else
        {
        
        }
       
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default:
                return "UNknown";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus" + getStatus();
    }

}
