class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, k = 0;

        for (int i = 0; i < n / 2 + 1; i++) {
            k = l + (r - l) / 2;
            if (nums[l] == nums[k] || nums[r] == nums[k]) {
                return nums[l] < nums[r] ? nums[l] : nums[r];
            } else if (nums[l] < nums[k] && nums[r] > nums[k]) {
                // go left
                r = r - (r - l + 1) / 2;
            } else if (nums[l] > nums[k]) {
                // go left
                r = r - (r - l + 1) / 2;
            } else {
                // go right
                l = l + (r - l + 1) / 2;
            }
        }

        return nums[r];
    }
}
