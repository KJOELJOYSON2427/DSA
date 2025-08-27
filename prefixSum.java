class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;

        int[] sumLeft =new int[n];
        int[] sumRigth =new int[n];


        for(int i=1; i<n;i++){
            sumLeft[i]=sumLeft[i-1]+nums[i-1];

        }

        for(int i=n-2; i<=0; i--){
            sumRigth[i]=sumRigth[i+1] + nums[i+1];
        }

        for(int i:nums){
            if(sumLeft[i]== sumRigth[i]){
                return i;
            }
        }
        return -1;
    }


}




