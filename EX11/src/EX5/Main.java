/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList  *
 * to replace an array to store students. Draw the new UML diagram for the class. *
 * You should not change the original contract of the Course class (i.e., the     *
 * definition of the constructors and methods should not be changed, but the      *
 * private members may be changed.)                                               *
 ******************************************************************************** */
package EX5;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudent());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudent(); i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudent());
    }
}
