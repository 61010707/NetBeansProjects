/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a           *
 * class named Person and its two subclasses named Student and Employee.          *
 * Make Faculty and Staff subclasses of Employee. A person has a name,            *
 * address, phone number, and email address. A student has a class status         *
 * (freshman, sophomore, junior, or senior). Define the status as a constant. An  *
 * employee has an office, salary, and date hired. Use the MyDate class defined   *
 * in Programming Exercise 10.14 to create an object for date hired.
 * A faculty    *
 * member has office hours and a rank. A staff member has a title.
 * Override the   *
 * toString method in each class to display the class name and the person’s name. *
 * Draw the UML diagram for the classes and implement them. Write a test program  *
 * that creates a Person, Student, Employee, Faculty, and Staff, and invokes      *
 * their toString() methods.                                                      *
 ******************************************************************************** */

/* Class = Person , Student , Employee , Faculty ,Staff ,MyDate
    Person [x] --> Student [x] ===========> status( constant ) : freshman , sophomore , junior , senior , toString
     |      |
     |      |-> Employee [x]-----------> Faculty [ ] ======> office hours, rank , toString
     |           |        |
     |           |        |----------> Staff [ ]  ======> title , toString
     |           |
     |           =========> office , salary, date hired ( MyDate) ,toString
     |
     ==============> name , address , phone number , email address,toString
 */
package EX2;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("John naval", "661 downTown", "0985623415", "kmitl.ac.th");
        System.out.println(person.toString());
        Student student = new Student("john snow", "199", "084251396", "kmitl", Student.Status.Freshman.ordinal());
        System.out.println(student.toString());
        Employee employee = new Employee("Time", "10425", "08562152", "kmitl.ac", "kmitl", "85554521");
        System.out.println(employee.toString());
        Faculty faculty = new Faculty("john", "1955", "065", "1521552", "dsds", "5512", "25", "dsds");
        System.out.println(faculty.toString());
        Staff staff = new Staff("dkgj", "sff", "02555", "kmit;", "adviser");
        System.out.println(staff.toString());

    }
}
