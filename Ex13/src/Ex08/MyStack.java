/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex08;

import java.util.ArrayList;

/**
 *
 * @author DrZin
 */
public class MyStack implements Cloneable {

    private ArrayList<Object> list = new ArrayList<>();

    private boolean isEmpty() {
        return list.isEmpty();
    }

    private int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MyStack myStackClone = (MyStack) super.clone();

        myStackClone.list = copyList();
        return myStackClone;
    }

    private ArrayList<Object> copyList() {
        ArrayList<Object> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));

        }
        return newList;
    }

}
