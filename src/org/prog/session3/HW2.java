package org.prog.session3;

import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
                     for (int i = 0, j= arr1.length - 1; i<j; i++, j--) {
                        int c = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = c;
                    }
                        System.out.println();
                       for (int i = 0; i < arr1.length; i++) {
                       System.out.println("arr1[" + i + "] = " + arr1[i]);
            }
        }
    }


