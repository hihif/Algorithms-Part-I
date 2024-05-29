import java.util.*;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue ;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int total = nums[i] + nums[l] + nums[r];
                if (total == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[r]);
                    tmp.add(nums[l]);
                    arr.add(tmp);
                    l++;
                    r--;
                } else if (total < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return arr;
    }

    // Tests
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 4, 0};

        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> arr : result)
            System.out.println(arr.toString());
    }      
}