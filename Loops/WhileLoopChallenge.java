public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;

        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number - " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenCount);
        System.out.println("Total odd number found = " + oddCount);

    }

    public static boolean isEvenNumber(int  n) {
        return n % 2 == 0;
    }
}
