public class Polindrom {
    public static void main(String[] args) {

        int number = -222;
        System.out.println("number " + number + " is palindrome" + isPalindrome(number));
//
//        int reverse = 0;
//        int workNumber = number;
//        int count = 0;
//
//        if (workNumber < 0) {
//            workNumber *= -1;
//        }

//        while (workNumber > 9) {
//            int lastDigit = workNumber % 10;
//            workNumber /= 10;
//            reverse *= 10;
//            reverse += lastDigit;
//        }
//        reverse *= 10;
//        reverse += workNumber;
//
//
//        if (reverse == number) {
//            System.out.println(number + " is a polindrome.");
//        }
//
//        System.out.println("Number = " + number + "\nreverse = " + reverse);


    }

    public static boolean isPalindrome(int number) {

        int original = number;
        int reverse = 0;



        if (original < 0) {
            original *= -1;
            number *= -1;
        }

        while (original != 0) {
            reverse *= 10;
            reverse += original % 10;

            original /= 10;
        }

        return reverse == number;

    }
}
