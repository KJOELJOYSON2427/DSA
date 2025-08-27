import java.util.HashMap;

public class LongestSubarraySumK {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int maxSubarray = 0;

        HashMap<Integer, Integer> prefixSum = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            // Case 1: sum from start to current index
            if (sum == k) {
                maxSubarray = i + 1;
            }

            // Case 2: subarray exists from prefix sum
            int complement = sum - k;
            if (prefixSum.containsKey(complement)) {
                int length = i - prefixSum.get(complement);
                maxSubarray = Math.max(maxSubarray, length);
            }

            // Store first occurrence of each prefix sum
            if (!prefixSum.containsKey(sum)) {
                prefixSum.put(sum, i);
            }
        }

        return maxSubarray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -2, 5};
        int k = 5;
        System.out.println("Longest subarray length with sum " + k + " is: " + longestSubarrayWithSumK(nums, k));
    }
}
