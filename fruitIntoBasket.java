import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        

        int n= fruits.length;
        int maxLen=0;
int left=0;
int right=0;
Map<Integer,Integer> mpp=new HashMap<>();
        while (right<n) {
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0)+1);

            if (mpp.size()>2) {
                while (mpp.size()>2) {
                    mpp.put(fruits[left],mpp.get(fruits[left])-1);
                    if(mpp.get(fruits[left])==0){
                        mpp.remove(fruits[left]);
                    }
                    left++;
                }
            }
            if(mpp.size()<=2){
            maxLen=Math.max(maxLen, right-left+1);
            right++;
            }
            
        }

        return  maxLen;
    }
}