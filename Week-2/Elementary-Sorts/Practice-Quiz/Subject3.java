import java.util.*;

public class Subject3 {
    public static void swap(int[] buckets, int i, int j) {
        int temp = buckets[i];
        buckets[i] = buckets[j];
        buckets[j] = temp;
    }

    public static int color(int bucket) {
        return bucket;
    }

    public static void DutchNationalFlag(int[] buckets) {
        int right = buckets.length - 1, mid = 0, left = 0;

        while (mid <= right) {
            int currColor = color(buckets[mid]);
            if (currColor == 0) {
                swap(buckets, left, mid);
                left++;
                mid++;
            } else if (currColor == 1) {
                mid++;
            } else {
                swap(buckets, mid, right);
                right--;
            }
        }
    }
    
    // Test code
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 1, 2, 2, 1, 2, 0, 0, 0, 1, 1, 0};
        DutchNationalFlag(a);
        for (int i : a)
            System.out.println(i + " ");
    }
}
