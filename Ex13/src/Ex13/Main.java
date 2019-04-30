/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Course course1 = new Course("Data");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne kennedy");

        Course course2 = course1.clone();
        course2.addStudent("Jamal Jones");
        course2.addStudent("Steve Smith");
        System.out.println("\nNumber of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();

        // Display students in course2
        System.out.println("\nNumber of students in course2: "
                + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(students2[i] + ", ");
        }
        System.out.println();

    }

}
