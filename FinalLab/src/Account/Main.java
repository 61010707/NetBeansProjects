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
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Account account = new Account(85, 25522, "DrZin");
        Account account2 = new Account(85, 25522, "DrZin");
        account.deposit(25);
        account.withdraw(25);
        
        System.out.println(account.getTransaction().get(0).getType());
        System.out.println("is equal  : " + account.equals(account2));
    }
}
