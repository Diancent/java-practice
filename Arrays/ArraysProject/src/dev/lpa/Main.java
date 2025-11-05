package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        myIntArray[0] = (int)10.0;

        double[] myDoubleArray = new double[10];
        myDoubleArray[5] = 3.5;

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        System.out.println("length = " + firstTen.length);
        System.out.println("last = " + firstTen[firstTen.length - 1]);

        int[] newArray;
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        for (Object object : objectArray) {
            System.out.println(object);
        }
    }
}
