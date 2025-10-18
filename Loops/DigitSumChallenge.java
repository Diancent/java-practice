public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("Sum of number 125 - " + digitSum(6));
    }

    public static int digitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        // number % 10 - save last
        // number = number / 10; - leave last

        while (number > 9) {
            sum += number % 10;
            number /= 10;
        }

        sum += number;

        return sum;
    }
}
