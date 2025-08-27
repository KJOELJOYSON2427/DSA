import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public boolean checkInclusion(String s1, String s2) {
   // Initialize
int len1 = s1.length();
int len2 = s2.length();
if (len1 > len2) return false; 


HashMap<Character, Integer> s1Count = new HashMap<>();
HashMap<Character, Integer> s2Count = new HashMap<>();

for (int i = 0; i < len1; i++) {
  s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
  s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
}


if (s1Count.equals(s2Count)) return true;


int left = 0;
for (int right = len1; right < s2.length(); right++) {
  
  char newChar = s2.charAt(right);
  s2Count.put(newChar, s2Count.getOrDefault(newChar, 0) + 1);

  
  char oldChar = s2.charAt(left);
  s2Count.put(oldChar, s2Count.get(oldChar) - 1);
  if (s2Count.get(oldChar) == 0) {
    s2Count.remove(oldChar);   }

  left++; 

  
  if (s1Count.equals(s2Count)) return true;
}
return false;

  }
}