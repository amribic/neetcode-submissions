class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        // Find minimum
        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[r] < nums[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
            
        int pivot = l;
        l = 0;
        r = nums.length - 1;

        if (target <= nums[r]) {
            l = pivot;
        } else {
            r = pivot - 1;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }
}
