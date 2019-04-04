/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasslab;

import java.util.Calendar;

/**
 *
 * @author 61010707
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject circlr = new Circle();
        Calendar cal = Calendar.getInstance();

        cal.set(2019, 7, 5);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        cal.add(Calendar.WEEK_OF_YEAR,3 );
        System.out.println(cal.get(Calendar.DATE));
    }

}
