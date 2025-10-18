public class NumbersToWords {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(123));
        numberToWords(100);
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;

        for (int i = number; number > 0; number /= 10) {
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {

        String oneWord = "One";
        String twoWord = "Two";
        String threeWord = "Three";
        String fourWord = "Four";
        String fiveWord = "Five";
        String sixWord = "Six";
        String sevenWord = "Seven";
        String eightWord = "Eight";
        String nineWord = "Nine";
        String zeroWord = "Zero";

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverse = reverse(number);

        int countNumber = getDigitCount(number);
        int countReverse = getDigitCount(reverse);

        if (countNumber != countReverse) {
            for (int i = 1; i < countNumber; i++) {
                reverse *= 10;
            }
        }


        for (int j = 1; j <= countNumber; j++) {

            int lastDigit = reverse % 10;
            String word = "";

            if (lastDigit == 1) {
                word = oneWord;
            } else if (lastDigit == 2) {
                word = twoWord;
            } else if (lastDigit == 3) {
                word = threeWord;
            } else if (lastDigit == 4) {
                word = fourWord;
            } else if (lastDigit == 5) {
                word = fiveWord;
            } else if (lastDigit == 6) {
                word = sixWord;
            } else if (lastDigit == 7) {
                word = sevenWord;
            } else if (lastDigit == 8) {
                word = eightWord;
            } else if (lastDigit == 9) {
                word = nineWord;
            } else {
                word = zeroWord;
            }


            System.out.println(word);
        }

    }
}
