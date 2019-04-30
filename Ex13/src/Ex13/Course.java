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
public class Course implements Cloneable {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public String[] getStudents()
    {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Course clone() throws CloneNotSupportedException {
        //Create CourseClone as Course object that Clone from super
        Course courseClone = (Course)super.clone();
        
       // courseClone.students = students.clone();
        return courseClone;
    }
    
    

}
