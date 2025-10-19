public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);

    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // i = 1  j = 7
        // i = 2 j = 6
        // i = 3 j = 5
        // i = 4 j = 4
        // i = 5 j = 3
        // i = 6 j = 2
        // i = 7 j = 1

        // i = number - j - 1
        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {
                if (j == i || i == 0 || j == 0 || j == number - 1 || i == number - 1 || i == number - j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
