import java.util.*;

public class DecimalDominants {
    public static Integer countOccurrences(Object[] array) {
        Map<Object, Integer> occurrences = new HashMap<>();
        int n = array.length;

        for (Object item : array) {
            occurrences.put(item, occurrences.getOrDefault(item, 0) + 1);
        }

        int counter = 0;
        for (Map.Entry<Object, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > n / 10)
                counter++;
        }
        return counter;
    }

    // Tests
    public static void main(String[] args) {
        // Example usage
        Object[] array = {1, 2, 3, 2, 4, 1, 2, 3, 5, 3};

        System.out.println(countOccurrences(array));
    }
}