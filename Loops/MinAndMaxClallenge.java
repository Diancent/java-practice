import java.util.Scanner;

public class MinAndMaxClallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextNumber = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(nextNumber);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
                System.out.println("Number: " + validNum + " Minimum: " + min + " Maximum: " + max);
            } catch (NumberFormatException nfe) {
                System.out.println("Not an integer number");
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("min = " + min + " max = " + max);
        } else {
            System.out.println("No valid data entered");
        }

    }
}
