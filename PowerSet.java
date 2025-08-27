import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets( result,new ArrayList<>(), 0, nums);
        return result;
    }

    static void generateSubsets(List<List<Integer>> result, List<Integer>current,int index, int [] arr){
                
        //base case 
        if(arr.length==index){
            result.add(new ArrayList<>(current));
            return;
        }

        //Include Current i
        current.add(arr[index]);
        generateSubsets(result, current, index+1, arr);

        //exclude current i
        current.remove(current.size()-1);
        generateSubsets(result, current, index+1, arr);
    }
}