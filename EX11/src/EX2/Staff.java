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
public class Staff extends Person {

    private String title;

    public Staff(String name, String address, String phone,
            String email, String title) {
        super(name, address, phone, email);
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
        return "Title : " + this.title + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
