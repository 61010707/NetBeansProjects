/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) {
        char[] test;
        test = new char[]{'T', 'e', 's', 't'};
        char[] test2;
        test2 = new char[]{'T', 'e', 's', 't'};
        MyString1 myString = new MyString1(test);
        MyString1 myString2 = new MyString1(test2);
        System.out.println("Hello World");
        System.out.println(myString.getChars());
        System.out.println(myString.charAt(2));
        System.out.println(myString.length());
        System.out.println(myString.suMyString(1, 4).getChars());
        System.out.println(myString.equals(myString2));
        System.out.println(myString.toLowerCase().getChars());
    }

}
