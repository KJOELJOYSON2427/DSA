class Solution {
    public int longestOnes(int[] nums, int k) {
        

        //
        int maxLen=0;
        int n =nums.length;
int Zeroes=0;
  int right;
  int left=0;
        for(right=0;right<n;right++){
                
            if(nums[right]==0){
                  Zeroes++;  
            }

            if(Zeroes>k){
                if(nums[left]==0) Zeroes--;
                left++;
            }
            if(Zeroes<=k){
                maxLen=Math.max(maxLen, right-left+1);
            }
        }
        return maxLen;
    }
}