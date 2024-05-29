class searchBitonic {    
    private static int peakFinder(int[] arr) {
            int l = 0;
            int r = arr.length - 1;
    
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] < arr[mid + 1])
                    l = mid + 1;
                else
                    r = mid;
            }
            return l;
        }
    
        private static int binarySearch(int[] arr, int l, int r, int target) {
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == target)
                    return target;
                if (arr[mid] < target)
                    l = mid + 1;
                else
                    r = mid;
            }
            return -1;
        }
    
        private static int rbinarySearch(int[] arr, int l, int r, int target) {
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == target)
                    return target;
                if (arr[mid] > target)
                    l = mid + 1;
                else
                    r = mid;
            }
            return -1;
        }
        
        public static boolean searchBitonicArray(int[] nums, int target) {
            int peak = peakFinder(nums);
        
            if (nums[peak] == target) {
                return true;
            } else {
                if (binarySearch(nums, 0, peak, target) != -1) {
                    return true;
                }
                if (rbinarySearch(nums, peak + 1, nums.length, target) != -1) {
                    return true;
                }
            }
            return false;
        }

        // Tests
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
            System.out.println(searchBitonicArray(nums, 4)); // true
            System.out.println(searchBitonicArray(nums, 6)); // false
            System.out.println(searchBitonicArray(nums, 0)); // true
            System.out.println(searchBitonicArray(nums, 1)); // true
            System.out.println(searchBitonicArray(nums, 2)); // true
        }
    }