import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result =new ArrayList<>();
         backTrack(0,0,new ArrayList<>(),target,candidates,result);
         return result;
    }

  private void backTrack(int index, int total, List<Integer> current, int target,int[] nums,List<List<Integer>> result){
       
     //base case 

     if(total==target){
        result.add(new ArrayList<>(current));
        return;
     }
     else if(total>target || index >= nums.length){
        return ;
     }


     //same number pick
      int sum=total+nums[index];
      current.add(nums[index]);
      backTrack(index, sum, current, target, nums, result);
      current.remove(current.size()-1);
      backTrack(index+1, total, current, target, nums, result);
  }
}