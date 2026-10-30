class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            // Start building sequence
            if (!numsSet.contains(num - 1)) {
                int length = 1;

                while (numsSet.contains(num + length)) {
                    length += 1;
                }

                maxLength = length > maxLength ? length : maxLength;
            }
        }

        return maxLength;
    }
}
