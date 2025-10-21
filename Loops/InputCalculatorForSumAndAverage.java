import java.util.Scanner;

public class InputCalculatorForSumAndAverage {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            String nextNumber = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(nextNumber);
                count++;
                sum += validNum;
                average = Math.round((double) sum / (double) count);
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
