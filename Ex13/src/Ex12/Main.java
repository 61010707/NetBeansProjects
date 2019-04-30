/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        GeometricObject[] array = {new Circle(15), new Circle(522), new Rectangle(15, 60)};
        System.out.println(sumArea(array));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
