package dev.andreribas;

import java.util.Arrays;

public class Exe08 {
    public static void main(String[] args) {
        int elements = 1000;
        int[] values = new int[elements];
        System.out.println("== New Unordered array ==");
        generateValues(values);
        printValues(values);

        System.out.println("== User Ordered array ==");
        bubbleSort(values);
        printValues(values);

        System.out.println();

        System.out.println("== New Unordered array ==");
        generateValues(values);
        printValues(values);

        System.out.println("== System Ordered array ==");
        Arrays.sort(values);
        printValues(values);
    }

    private static void printValues(int[] values) {
        String separator = "";
        for (Integer value : values) {
            System.out.printf("%s%d", separator, value);
            separator = ", ";
        }
        System.out.println();
    }

    private static void generateValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 1000);
        }
    }

    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
