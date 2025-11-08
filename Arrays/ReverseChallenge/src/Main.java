import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
//        System.out.println("sd" + Arrays.toString(array));
        reverse(array);
//        System.out.println("-".repeat(20));
//        System.out.println(Arrays.toString(array));
    }

//    private static void reverse(int[] array) {
//
//        int[] reversedArray = Arrays.copyOf(array, array.length);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = reversedArray[array.length - 1 - i];
//        }
//
//        System.out.println(Arrays.toString(array));
//    }

//    public static void reverse(int[] array) {
//
//        int maxIndex = array.length - 1;
//        int halfLength = array.length / 2;
//
//        for (int i = 0; i < halfLength; i++) {
//            int temp = array[i];
//            array[i] = array[maxIndex - i];
//            array[maxIndex - i] = temp;
//        }
//    }

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    public static void reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;

        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }
    }

}
