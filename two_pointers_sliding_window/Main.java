
import java.util.*;

class Solution {
    // Function to return length of longest substring with at most K distinct characters
      public int lengthOfLongestSubstringKDistinct(String s, int k) {
            
        Map<Character, Integer> map = new HashMap<>();
       int left =0;
       int maxLenght =0;

        if(s.length() == 0 || k == 0) return 0;

      for(int right=0; right < s.length(); right ++){
               

        char c = s.charAt(right);

          map.put(c, map.getOrDefault(c, 0)+1);

          while (map.size() > k) {
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) -1);
            
            if(map.get(leftChar) == 0){
                map.remove(leftChar);
            }

            left++;
          }

          maxLenght = Math.max(maxLenght, right - left + 1);
      }
        return maxLenght;
      }

}
// Separate main class
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aaabbbcabc";
        int k = 2;
        System.out.println(sol.lengthOfLongestSubstringKDistinct(s, k));
    }

}