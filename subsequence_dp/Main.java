import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array size
        int n = sc.nextInt();

        // input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // input target / difference
        int diff = sc.nextInt();

        // call your function here
        Solution sol = new Solution();
        int ans = sol.countPartitions(arr, diff);

        System.out.println(ans);
        sc.close();
    }
}

// put your logic inside this class
class Solution {
    public int countPartitions(int[] arr, int diff) {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }

        if (((sum-diff)<=0 )|| ((sum-diff)%2)!=0){
            return 0;
        }

        int[][]dp = new int[arr.length][((sum-diff)/2)];

       

        return 0;
    }
}
