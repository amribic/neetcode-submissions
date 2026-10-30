class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> stringsWithChars = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> stringMap = new HashMap<>();
            String currentString = strs[i];
            for (int j = 0; j < currentString.length(); j++) {
                stringMap.put(currentString.charAt(j), stringMap.getOrDefault(currentString.charAt(j), 0) + 1);
            }
            stringsWithChars.computeIfAbsent(stringMap, k -> new ArrayList<>()).add(currentString);
        }

        return new ArrayList(stringsWithChars.values());
    }
}
