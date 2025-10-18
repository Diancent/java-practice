public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12,23);
    }

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || b < 10 || a > 99 || b > 99) {
            return false;
        }

        for (int i = a; i > 0; i /= 10) {

            int lastDigitA = i % 10;

            for (int j = b; j > 0; j /= 10) {
                int lastDigitB = j % 10;

                if (lastDigitB == lastDigitA) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        boolean firstValid = a > 9 && a < 1001;
        boolean secondValid = b > 9 && b < 1001;
        boolean thirdValid = c > 9 && c < 1001;

        if (!firstValid || !secondValid || !thirdValid) {
            return false;
        }

        int lastDigitOfA = a % 10;
        int lastDigitOfB = b % 10;
        int lastDigitOfC = c % 10;

        return lastDigitOfA == lastDigitOfB || lastDigitOfA == lastDigitOfC || lastDigitOfB == lastDigitOfC;
    }
}
