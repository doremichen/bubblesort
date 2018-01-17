/**
 * Bubble sort example
 */
package com.adam.app.bbsort;

public class BubbleSort {

    /**
     * 
     * Bubble sort flow
     *
     * @param array
     */
    static void doBubbleSort(int[] array) {
        int switchtemp;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] > array[j]) {
                    switchtemp = array[i];
                    array[i] = array[j];
                    array[j] = switchtemp;
                }
            }
        }
    }

    /**
     * 
     * Log byte array
     *
     * @param array
     */
    static void printArray(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        System.out.println(result + "\n");
    }

    /**
     * 
     * Main function
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] iArray = { 25, 36, 47, 32, 21, 16 };
        System.out.println("Before sort: \n");
        printArray(iArray);
        System.out.println("after sort: \n");
        doBubbleSort(iArray);
        printArray(iArray);

    }

}
