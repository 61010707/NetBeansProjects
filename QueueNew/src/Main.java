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
        Queue queue = new Queue();

        for (int i = 0; i <100000; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < queue.getCallTime(); i++) {
            System.out.print(queue.dequeue() + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println(" ");
            }
        }

        System.out.println(queue.getCapacity() + " and " + queue.getSize() + " and " + queue.getElements().length);
    }
}
