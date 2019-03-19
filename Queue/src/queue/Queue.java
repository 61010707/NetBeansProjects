/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author 61010707
 */
public class Queue {

    private int[] elements;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public Queue() {
        this(8);
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }

        elements[size++] = v;
        System.out.println("in en queue size " + size);
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
            if ((i + 1) % 8 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println(" ");

    }

    public int dequeue() {
        int v = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return v;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

}
