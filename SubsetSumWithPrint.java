 import java.util.ArrayList;
import java.util.List;

public class SubsetSumWithPrint {
    static int target = 8; // ✅ Define target sum

    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(result, new ArrayList<>(), 0, nums);

    }

    static void generateSubsets(List<List<Integer>> result, List<Integer> current, int index, int[] arr) {
        // base case
        if (index == arr.length) {
            if (sum(current) == target) {
                System.out.println(current + " is a target");
            }
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(arr[index]);
        generateSubsets(result, current, index + 1, arr);

        // Exclude current element (backtrack)
        current.remove(current.size() - 1);
        generateSubsets(result, current, index + 1, arr);
    }

    static int sum(List<Integer> list) {
        int s = 0;
        for (int num : list) {
            s += num;
        }
        return s;
    }
}
 
