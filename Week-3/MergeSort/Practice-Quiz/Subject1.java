import java.util.*;

public class Subject1 {
    public static void auxiliaryMerging(int[] arr) {
        int n = arr.length / 2;
        int[] aux = new int[n];
        System.arraycopy(arr, 0, aux, 0, n);
        
        int idx = 0;
        int i = 0;
        int j = n;
        while (i < n && j < n*2) {
            if (aux[i] <= arr[j])
                arr[idx++] = aux[i++];
            else 
                arr[idx++] = arr[j++];
        }
        while (i < n)
            arr[idx++] = aux[i++];
        while (j < n * 2)
            arr[idx++] = arr[j++];
    }

    // test code
    public static void main(String[] args) {
        int[] a = {10, 13, 17, 18, 22, 28, 30, 32, 35, 42, 45, 50, 55, 57, 58, 65, 67, 76, 80, 95, 4, 6, 9, 15, 19, 21, 23, 26, 33, 37, 44, 48, 53, 59, 60, 62, 68, 70, 73, 79};
        auxiliaryMerging(a);
        System.out.println(Arrays.toString(a));
    }
}