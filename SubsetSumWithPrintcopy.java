import java.util.ArrayList;
import java.util.List;

class SubsetSumWithK {
    static int target = 8; // target sum

    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(result, new ArrayList<>(), 0, 0, nums);

        System.out.println("All subsets that sum to " + target + ":");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    static void generateSubsets(List<List<Integer>> result, List<Integer> current, int total, int index, int[] arr) {
        if (total == target) {
            result.add(new ArrayList<>(current));
            return; // ✅ Optional: skip further unnecessary recursion
        }
        if (total > target || index >= arr.length) {
            return;
        }

        // Include current element
        current.add(arr[index]);
        generateSubsets(result, current, total + arr[index], index + 1, arr);

        // Exclude current element (backtrack)
        current.remove(current.size() - 1);
        generateSubsets(result, current, total, index + 1, arr); // pass total unchanged
    }
}
