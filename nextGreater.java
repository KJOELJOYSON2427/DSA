import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int []arr =new int[nums1.length];
        HashMap<Integer, Integer> NextGreaterIntegerNum2 =new HashMap<>();

        Stack<Integer> stack =new Stack<>();

        
        for(int i=nums2.length-1; i>=0;i--){
            
//             if(stack.isEmpty()){
//                 NextGreaterIntegerNum2.put(nums2[i], -1);
//                 stack.push(nums2[i]);
//                 continue;
//             }

//  if(stack.peek()>nums2[i]){
//     NextGreaterIntegerNum2.put(nums2[i], stack.peek());
//                 stack.push(nums2[i]);
//                 continue;
//  }

            while (!stack.isEmpty() && stack.peek()<=nums2[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                NextGreaterIntegerNum2.put(nums2[i], -1);
            }else{
                NextGreaterIntegerNum2.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }

        for(int j=0; j<nums1.length; j++){
             arr[j]=NextGreaterIntegerNum2.get(nums1[j]);
        }
        return arr;
    }
}