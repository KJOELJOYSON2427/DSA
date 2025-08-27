public class BstElimination {
    public int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        int mid=0;

        while (lo<=hi) {
            
            mid=lo+(hi-lo)/2;

            if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<=nums[hi]){
                        hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[hi]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }

        }
        return -1;
    }


     public boolean searchWithDuplicates(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        int mid=0;

        while (lo<=hi) {
            
            mid=lo+(hi-lo)/2;
            if(nums[mid]==target) return true;
            if (nums[mid]==nums[hi] && nums[mid]== nums[lo]) {
                lo++;
                hi--;
            }
            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<=nums[hi]){
                        hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[hi]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }

        }
        return false;
    }

     public int findMin(int[] nums) {
         int lo=0;
        int hi=nums.length-1;
        int mid=0;
int minimum=Integer.MAX_VALUE;
        while (lo<=hi) {
            
            mid=lo+(hi-lo)/2;

            if(nums[lo]<=nums[mid]){
                 minimum=Math.min(nums[lo], minimum);
                 lo=mid+1;
            }else{
minimum=Math.min(nums[mid], minimum);
hi=mid-1;
            }


    }
    return minimum;
}
}
