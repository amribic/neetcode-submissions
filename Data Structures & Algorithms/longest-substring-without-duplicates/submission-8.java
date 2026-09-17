class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<String> uniqueSet = new HashSet<>();
        String[] chars = s.split("");
        
        int length = 0;
        int maxLength = 0;
        int l = 0, r = 0;
        
        while (r < s.length()) {
            if (!uniqueSet.contains(chars[r])) {
                uniqueSet.add(chars[r]);
            } else {
                while (!chars[l].equals(chars[r])) {
                    uniqueSet.remove(chars[l]);
                    l++;
                }
                l++;
            }
            length = r - l + 1;
            
            if (length > maxLength) {
                maxLength = length;
            }

            r++;
        }
        return maxLength; 
    }
}
