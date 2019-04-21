/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10;

import java.util.ArrayList;

/**
 *
 * @author DrZin
 */
public class MyStack extends java.util.ArrayList {

    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<Object>();
    }

    public void push(Object o) {
        list.add(0, o);
    }

    public Object peek() {
        return list.get(0);
    }

    public Object pop() {
        Object object = list.get(0);
        list.remove(0);
        return object;
    }

    @Override
    public String toString() {
        return "Stack : " + list.toString();
    }

}
