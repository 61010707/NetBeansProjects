/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented *
 * using composition. Define a new stack class that extends ArrayList.            *
 * Draw the UML diagram for the classes and then implement MyStack. Write a test  *
 * program that prompts the user to enter five strings and displays them in       *
 * reverse order.                                                                 *
 ******************************************************************************** */
package Ex10;

import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        MyStack myStack = new MyStack();

        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Input numer or string " + i + " :  ");
            myStack.push(inputScanner.next());
        }

        System.out.println("Stack : " + myStack.toString());
    }
}
