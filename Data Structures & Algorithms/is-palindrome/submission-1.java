class Solution {
    public boolean isPalindrome(String s) {
        // Remove whitespaces
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (i <= n - 1) {
                if (s.charAt(i) != (s.charAt(n - 1 - i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
