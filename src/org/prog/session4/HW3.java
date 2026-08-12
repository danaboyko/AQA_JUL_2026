package org.prog.session4;

import java.util.Random;

public class HW3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(20);
            System.out.println(arr1[i]);
        }
        int i = 0;
        while ( i < arr1.length - 1) {

            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int k = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = k;
                }
            }
            i++;
        }
        System.out.println("Відсортований масив:");
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }
    }
}



