/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** ************************************
 *               Course                *
 *-------------------------------------*
 * -courseName: String                 *
 * -students: ArrayList<String> * -numberOfStudents: int * +Course(courseName:
 * String) * +getCourseName(): String * +addStudent(student: String): void *
 * +dropStudent(student: String): void * +getStudents(): String[] *
 * +getNumberOfStudents(): int * ***********************************
 */
package EX5;

import java.util.ArrayList;

/**
 *
 * @author DrZin
 */
public class Course {

    private String courseName;
    private ArrayList<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        String[] a = new String[students.size()];
        return students.toArray(a);
    }

    public int getNumberOfStudent() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}
