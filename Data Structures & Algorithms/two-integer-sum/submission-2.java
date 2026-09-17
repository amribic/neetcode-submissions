class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer j = hashMap.get(target - nums[i]);

            if (j != null) {
                return new int[] {j, i};
            } else {
                hashMap.put(nums[i], i);
            }
        }

        return null;
    }
}
