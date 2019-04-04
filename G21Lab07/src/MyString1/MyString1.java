/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyString1;

/**
 *
 * @author 61010707
 */
public class MyString1 {

    private char[] chars;

    public MyString1() {
    }

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, this.chars.length);
    }

    public char charAt(int index) {

        return this.chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 suMyString(int begin, int end) {
        char[] temp;
        int j = 0;
        temp = new char[end - begin];
        for (int i = begin; i < end; i++) {
            temp[j] = this.charAt(i);
            j++;
        }
        return new MyString1(temp);
    }

    public boolean equals(MyString1 s) {
        boolean isEquals = true;
        if (this.chars.length == s.length()) {
            for (int i = 0; i < this.chars.length; i++) {
                if (this.chars[i] != s.charAt(i)) {
                    isEquals = false;
                }
            }
        } else {
            isEquals = false;
        }
        return isEquals;
    }

    public MyString1 toLowerCase() {
        char[] temp;
        temp = new char[this.chars.length];
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] >= 'A' && this.chars[i] <= 'Z') {
                temp[i] = (char) (this.chars[i] + 32);
            } else {

                temp[i] = (char) (this.chars[i]);
            }
        }

        return new MyString1(temp);
    }

    public static MyString1 valueOf(int i) {
        // Count the number of digits in i
        int length = 0;
        int n = i;
        while (n >= 1) {
            n /= 10;
            length++;
        }

        // Create a char array of the length of i
        char[] ch = new char[length];

        // Copy the digits in i to the array
        for (int j = 0, k = (int) Math.pow(10, length - 1);
                j < length; j++, k /= 10) {
            ch[j] = Character.forDigit((i / k), 10);
            i %= k;
        }

        return new MyString1(ch);
    }

    public char[] getChars() {
        return chars;
    }
}
