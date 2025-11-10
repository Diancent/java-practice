import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);
        originalList.set(0, "one");
        originalList.sort(Comparator.naturalOrder());
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("numbers: " + numbers);
    }
}
