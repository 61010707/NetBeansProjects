/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
public class MyStringBuilder1 {

    private String str;

    public MyStringBuilder1(String s) {
        this.str = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        String temp = this.str;
        temp += s.getStr();
        return new MyStringBuilder1(temp);
    }

    public MyStringBuilder1 append(int i) {
        String temp = this.str;
        temp += i;
        return new MyStringBuilder1(temp);
    }

    public MyStringBuilder1 toLowerCase() {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                newStr += (char) (str.charAt(i) + 32) + "";
            } else {
                newStr += (char) (str.charAt(i));
            }
        }
        return new MyStringBuilder1(newStr);
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String newStr = "";
        for (int i = begin; i < end; i++) {
            newStr += str.charAt(i) + "";
        }
        return new MyStringBuilder1(newStr);
    }

    public int length() {
        return this.str.length();
    }

    public char charAt(int index) {
        return this.str.charAt(index);
    }

    public String getStr() {
        return str;
    }

}
