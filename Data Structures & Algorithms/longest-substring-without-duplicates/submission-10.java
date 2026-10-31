class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        
        Set<Character> chars = new HashSet<>();
        chars.add(s.charAt(0));

        int l = 0;
        int r = 1;
        int longest = 1;

        while (r < s.length()) {
            if (chars.contains(s.charAt(r))) {
                longest = Math.max(longest, chars.size());
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
