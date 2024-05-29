import java.util.*;

public class Subject2 {
    private static int mergeAndCount(int[] arr, int[] right, int[] left) {
        int count = 0, i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                count += left.length - i;
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length) 
            arr[k++] = right[j++];
        return count;
    }
    public static int countingInversions(int[] arr) {
        int count = 0;
        if (arr.length <= 1)
        return 0;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        count += countingInversions(left);
        count += countingInversions(right);
        count += mergeAndCount(arr, right, left);
        return count;
    }

    // test code
    public static void main(String[] args) {
        int[] a = {0, 2, 3, 1, 4, 5, 9};
        System.out.println(countingInversions(a));
        System.out.println(Arrays.toString(a));
    }
}