/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("nieve", "11/3", "0830951385", "hello");
        System.out.println(person.toString());

        Student student = new Student("HellO", "test", "0000", "hello", 2);
        System.out.println(student.toString());

        MyDate md = new MyDate();
        System.out.println(md.toString());
        Employee employee = new Employee("unknown", "unknown", "unknown", "unknown", "unknown", 1);
    }
}
