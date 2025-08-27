import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> maxWindow =new ArrayList<>();
        Deque<Integer> dq =new ArrayDeque<>();
        

        for(int i=0; i<nums.length;i++){
              while(!dq.isEmpty() && dq.peekFirst()<=i-k){
   dq.pollFirst();

              }

              //Montonivc Decresing order
              while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
              }

              dq.offerLast(i);
//MaxSlidingArray
              if(i>=k-1){
                maxWindow.add(nums[dq.peekFirst()]);
              }
        }

        return maxWindow.stream().mapToInt(Integer::intValue).toArray();
    }
}