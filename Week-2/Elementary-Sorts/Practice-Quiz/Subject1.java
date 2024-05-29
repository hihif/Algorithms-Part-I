import java.util.*;

public class Subject1 {
    public static int Itersection(int[][] a, int[][] b) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        // Store the points in array a in the hash table
        for (int[] point : a) {
            String key = point[0] + "," + point[1];
            map.put(key, 1);
        }

        // Count the number of points in array b that are also in array a
        for (int[] point : b) {
            String key = point[0] + "," + point[1];
            if (map.containsKey(key)) {
                count++;
            }
        }
        return count;
    }

    // Test code
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}, {-1, 4}, {4, 1}};
        int[][] b = {{1, 2}, {5, 6}, {9, 10}, {-1, 4}, {8, 1}};

        System.out.println(Itersection(a, b));
    }
}