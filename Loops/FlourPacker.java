public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // 1 bigCount = 5 kilos
        // 1 smallCount = 1 kilo

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }


        for (int i = 0; i < bigCount; i++) {
            if (goal > bigCount && goal >= 5) {
                goal -= 5;
            }
        }

        for (int j = 0; j < smallCount; j++) {
            goal--;
        }

        return goal <= 0;
    }
}
