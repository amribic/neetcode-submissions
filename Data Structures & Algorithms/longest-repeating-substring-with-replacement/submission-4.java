class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            int max = 0;
            Character maxKey;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            if ((r - l + 1) - max <= k) {
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
