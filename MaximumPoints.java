class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n=cardPoints.length;
int maxSum=0;
        int sum=0;
        
        for( int left=0; left<k;left++){
            sum+=cardPoints[left];
        }
maxSum=sum;
        for(int right=k-1;right>=0;right--){
            sum-=cardPoints[right];
            sum+=cardPoints[n-right];

            maxSum=Math.max(maxSum, sum);
        }

        return maxSum;
    }

}