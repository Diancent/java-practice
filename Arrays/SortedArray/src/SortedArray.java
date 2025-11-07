import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        int[] arr = getIntegers(5);
        System.out.println(Arrays.toString(arr));
        sortIntegers(arr);
        printArray(arr);
    }

    public static int[] getIntegers(int len) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[len];
        System.out.println("Enter " + len + " integer values:\r");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] array) {

        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("Element %d contents %d %n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }

        return array;
    }
}
