package BinarySearch;
public class FindInPeakMountain {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 6, 2};
        int item = 3;
        System.out.println(search(arr, item));
    }
    static int search(int[] nums, int item) {
        int peak = peak(nums);
        int firstTry = orderAgnostic(nums, item, 0, peak);
        if (firstTry != -1) {
           return firstTry;
        }
        return orderAgnostic(nums,item,peak+1,nums.length-1);
    }

    static int peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return start;
    }


    static int orderAgnostic(int[] nums, int item, int start, int end) {
        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == item) {
                return mid;
            }
            if (isAsc) {
                if (nums[mid] < item) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] < item) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
