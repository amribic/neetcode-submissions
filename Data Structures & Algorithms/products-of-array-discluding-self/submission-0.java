class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];

        prefixProduct[0] = 1;
        prefixProduct[1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }

        suffixProduct[nums.length-1] = 1;
        suffixProduct[nums.length-2] = nums[nums.length-1];
        for (int i = nums.length - 3; i >= 0; i--) {
            suffixProduct[i] = nums[i+1] * suffixProduct[i+1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixProduct[i] * suffixProduct[i];
        }

        return result;
    }
}  
