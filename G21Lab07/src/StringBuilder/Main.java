/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder;

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) {
        String str;
        String str2;

        str = "HelloWorld";
        str2 = "Haha";

        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(str);
        MyStringBuilder1 myStringBuilder2 = new MyStringBuilder1(str2);

        System.out.println(" Original world = " + myStringBuilder1.getStr());
        System.out.println(" Append Haha = " + myStringBuilder1.append(myStringBuilder2).getStr());
        System.out.println(" Append 2 = " + myStringBuilder1.append(2).getStr());
        System.out.println(" toLowerCase = " + myStringBuilder1.toLowerCase().getStr());
        System.out.println(" subString  2 ,4 = " + myStringBuilder1.substring(0, 2).getStr());
        System.out.println(" Length = " + myStringBuilder1.length());
        System.out.println(" CharAt 2 = " + myStringBuilder1.charAt(2));

    }
}
