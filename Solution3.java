class Solution {
    public int characterReplacement(String s, int k) {
        int[] hashTable = new int[26];
        int left = 0, maxFreq = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            hashTable[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hashTable[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                hashTable[s.charAt(left) - 'A']--;
                left++;

               
                maxFreq = 0;
                for (int c : hashTable) {
                    maxFreq = Math.max(maxFreq, c);
                }
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
