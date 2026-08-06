class Solution {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        int length = 0;
        boolean odd = false;

        for (int i = 0; i < 128; i++) {

            if (freq[i] % 2 == 0) {
                length += freq[i];
            } else {
                length += freq[i] - 1;
                odd = true;
            }
        }
        if (odd) {
            length++;
        }

        return length;
    }
}