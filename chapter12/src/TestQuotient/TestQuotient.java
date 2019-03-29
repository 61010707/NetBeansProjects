/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestQuotient;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 61010707
 */
public class TestQuotient {

    public static void main(String[] args) {
        System.out.println("hello world");
        demo2();
    }

    static void demo2() {
        Scanner input = new Scanner(System.in);

        try {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            try {
                quotient(n1, n2);
            } catch (ArithmeticException e) {
                System.err.println(e.toString());
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }

    private static void quotient(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("divisor cannot divide by zero");
        }

    }
}
