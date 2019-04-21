/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex08;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack stack1 = new MyStack();
        System.out.println("Pushing the number 4, 5, and 6 to 1st stack...");
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);

        System.out.println("Cloning 1st stack...");
        MyStack stack2 = (MyStack) stack1.clone();

        System.out.println("Popping object from 1st stack...");
        stack1.pop();

        System.out.print("1st ");
        System.out.println(stack1.toString());
        System.out.print("2nd ");
        System.out.println(stack2.toString());
        System.out.println("Is the 1st stack equal to the 2nd? "
                + (stack1 == stack2));
    }
}
