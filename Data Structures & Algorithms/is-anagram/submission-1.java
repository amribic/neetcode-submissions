class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> sMap = new HashMap<>();
        String[] sArr = s.split("");

        Map<String, Integer> tMap = new HashMap<>();
        String[] tArr = t.split("");

        for (int i = 0; i < sArr.length; i++) {
            int value = sMap.getOrDefault(sArr[i], 0);
            sMap.put(sArr[i], value + 1);
        }

        for (int i = 0; i < tArr.length; i++) {
            int value = tMap.getOrDefault(tArr[i], 0);
            tMap.put(tArr[i], value + 1);
        }

        return sMap.equals(tMap);
    }
}
