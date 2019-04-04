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

    void sort(double arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first 
            // element 
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
        }
    }

    void generate(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double[] arr = new double[100000];
        Main ob = new Main();
        ob.generate(arr);
        stopWatch.start();
        ob.sort(arr);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime() + "  millisecond");
    }

}
