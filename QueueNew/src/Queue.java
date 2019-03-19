/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
class Queue {

    private int[] elements;
    private int size;
    private int capacity;
    private int callTime;

    public Queue() {
        this.capacity = 8;
        this.elements = new int[capacity];
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
    }

    public void enqueue(int number) {
        callTime++;
        if (size >= elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = number;

    }

    public int dequeue() {
        int number = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int[] getElements() {
        return elements;
    }

    public int getCallTime() {
        return callTime;
    }
    

}
