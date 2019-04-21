/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

/**
 *
 * @author DrZin
 */
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(25);
        Circle circle2 = new Circle(35);
        System.out.println(Circle.max(circle1, circle2).toString());
    }
}
