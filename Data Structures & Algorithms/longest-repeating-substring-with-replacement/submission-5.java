class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int res = 0;
        int maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            int count = map.getOrDefault(s.charAt(r), 0) + 1;
            map.put(s.charAt(r), count);

            maxFreq = Math.max(maxFreq, count);

            if ((r - l + 1) - maxFreq <= k) {
                if (r - l + 1 > res) {
                    res = r - l + 1;
                }
            } else {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            r++;

        }

        return res;
    }
}
