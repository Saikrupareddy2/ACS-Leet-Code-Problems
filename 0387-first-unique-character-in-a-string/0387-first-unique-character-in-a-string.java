
        class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count frequencies
        int[] freq = new int[26]; // only lowercase letters
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Step 2: Find first non-repeating
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // Step 3: No unique character
        return -1;
    }
}

    
