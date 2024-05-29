import java.util.*;

public class Subject2 {
    public static boolean Permutation(int[] a, int[] b) {
        Map<Integer, Integer> map = new HashMap<>();

        // Store the values from the first array to the HashMap
        for (int x : a) {
            map.put(x, 1);
        }

        // Loop through the second one if u find 1 number that is not in the HashMap return false
        for (int y : b) {
            if (map.get(y) == null) {
                return false;
            }
        }
        return true;
    }
    
    // Test code
    public static void main(String[] args) {
        int[] a = {8, 7, 6, 5, 4, 9, 2, 1};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Permutation(a, b));
    }
}