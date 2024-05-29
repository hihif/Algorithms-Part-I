import java.util.*;

public class NutsAndBolts {
    public static void matchPairs(char[] nuts, char[] bolts, int low, int high) {
        if (low < high) {
            // Randomly select a pivot from bolts array and use it to partition nuts array
            int v = (int) (Math.random() * (high - low + 1));
            int pivot = partition(nuts, low, high, bolts[v]);
            
            // Use the corresponding nut for the partitioning of bolts array
            partition(bolts, low, high, nuts[pivot]);
            
            // Recur for the subarrays before and after the pivot
            matchPairs(nuts, bolts, low, pivot - 1);
            matchPairs(nuts, bolts, pivot + 1, high);
        }
    }

    private static int partition(char[] arr, int low, int high, char pivot) {
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            } else if (arr[j] == pivot) {
                swap(arr, j, high);
                j--;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Tests
    public static void main(String[] args) {
        char[] nuts = {'@', '#', '$', '%', '^', '&'};
        char[] bolts = {'$', '%', '&', '^', '@', '#'};

        // Match nuts and bolts
        matchPairs(nuts, bolts, 0, nuts.length - 1);

        // Print matched pairs
        for (int i = 0; i < nuts.length; i++) {
            System.out.println(nuts[i] + " - " + bolts[i]);
        }
    }
}