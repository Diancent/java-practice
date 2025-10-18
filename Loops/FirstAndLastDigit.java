public class FirstAndLastDigit {

    public static void main(String[] args) {
        int number = 123;
        System.out.println("Number - " + number + " sum first and last digit is " + sumFirstAndLastDigit(number));

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }

        return firstDigit + lastDigit;

    }
}
