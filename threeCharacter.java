import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for(int i=n-1; i>=0; i--){
            lastSeen.put(s.charAt(i), i);

            if(lastSeen.containsKey('a') && lastSeen.containsKey('b') && lastSeen.containsKey('c')){
                 count+=(n-Math.max(lastSeen.get('a'),Math.max(lastSeen.get('b'),lastSeen.get('c'))));

            }
        }
        return count;
    }
}