import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {

    public static void main(String[] args) {

        int[] array = getRandomArray(5);
        System.out.println(Arrays.toString(array));

        int[] sortedArray = sortIntegers(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));
//
//        Arrays.sort(array);
//        int[] secondArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//
//            secondArray[i] = array[array.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(secondArray));
    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1000);
        }

        return arr;
    }

    public static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
