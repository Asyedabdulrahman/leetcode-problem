class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Step 1: Transform the string to handle even-length cases
        StringBuilder transformed = new StringBuilder();
        transformed.append("#");
        for (char c : s.toCharArray()) {
            transformed.append(c).append("#");
        }
        String T = transformed.toString();

        int n = T.length();
        int[] P = new int[n]; // Stores palindrome radius
        int center = 0, right = 0; // Current center and right boundary
        int maxLen = 0, maxCenter = 0;

        // Step 2: Expand around centers
        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i; // Mirror index of i

            // Use previously computed values if within the right boundary
            if (i < right) {
                P[i] = Math.min(right - i, P[mirror]);
            }

            // Expand around center i
            while (i - P[i] - 1 >= 0 && i + P[i] + 1 < n &&
                   T.charAt(i - P[i] - 1) == T.charAt(i + P[i] + 1)) {
                P[i]++;
            }

            // Update center and right if a longer palindrome is found
            if (i + P[i] > right) {
                center = i;
                right = i + P[i];
            }

            // Keep track of the longest palindrome
            if (P[i] > maxLen) {
                maxLen = P[i];
                maxCenter = i;
            }
        }

        // Step 3: Extract the longest palindrome from transformed string
        int start = (maxCenter - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
