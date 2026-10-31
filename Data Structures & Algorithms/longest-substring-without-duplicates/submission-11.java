class Solution {
    public int lengthOfLongestSubstring(String s) {        
        Set<Character> chars = new HashSet<>();

        int l = 0;
        int r = 0;
        int longest = 0;

        while (r < s.length()) {
            if (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            } else {
                chars.add(s.charAt(r));
                longest = Math.max(longest, chars.size());
                r++;
            }
        }

        return longest;
    }
}
