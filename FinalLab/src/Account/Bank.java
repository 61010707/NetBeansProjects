/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author DrZin
 */
public abstract class Bank {
    private String bank ; 

    public Bank() {
    }

    public Bank(String bank) {
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    
    public abstract void moveBank();
}
