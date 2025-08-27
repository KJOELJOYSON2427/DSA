import java.util.HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        int longestConsecutive =0;
        
        HashMap<Integer,Boolean> lookUp =new HashMap<>();

        for(int i=0; i<nums.length; i++){
           lookUp.put(nums[i], Boolean.FALSE);
        }


     for(int i=0; i<nums.length; i++){
        int currentLength=1;
       lookUp.put(nums[i], Boolean.TRUE);
        //forward direction
        int nextNum = nums[i]+1;

        while(lookUp.containsKey(nextNum) && lookUp.get(nextNum)==Boolean.FALSE){
            currentLength++;
            lookUp.put(nextNum, Boolean.TRUE);
            nextNum++;
        }

        //reverase direction
        int prevNum =nums[i]-1;

        while(lookUp.containsKey(prevNum) && lookUp.get(prevNum)==Boolean.FALSE){
            currentLength++;
            lookUp.put(prevNum, Boolean.TRUE);
            prevNum++;
        }

        longestConsecutive =Math.max(currentLength, longestConsecutive);
     }
     return longestConsecutive;
    }}
