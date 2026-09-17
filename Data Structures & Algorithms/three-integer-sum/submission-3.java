class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex) {
                int value = nums[i] + nums[leftIndex] + nums[rightIndex];

                if (value > 0) {
                    rightIndex--;
                } else if (value < 0) {
                    leftIndex++;
                } else {
                    results.add(List.of(nums[i], nums[leftIndex], nums[rightIndex]));

                    leftIndex++;
                    rightIndex--;
                    
                    while (leftIndex < nums.length && nums[leftIndex] == nums[leftIndex - 1]) {
                        leftIndex++;
                    }

                    while (rightIndex > i && nums[rightIndex] == nums[rightIndex + 1]) {
                        rightIndex--;
                    }
                }
            }
        }

        return results;
    }
}
