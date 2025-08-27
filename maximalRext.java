import java.util.Stack;

class Solution {
    public int maximalRectangle(char[][] matrix) {
         if(matrix.length==0) return 0;
           int n=matrix.length;
int maxArea=0;
           int m=matrix[0].length;
           int [] heights=new int[m];

           for (char[] row : matrix) {
            for(int j=0;j<m;j++){
                   if(row[j] == '1'){
                    heights[j]+=1;
                   }else if(row[j] == '0'){
                    heights[j]=0;
                   }
            }

            maxArea=Math.max(maxArea, largestRectangleArea(heights));
           }
return maxArea;
    }

 public int largestRectangleArea(int[] heights) {
    int n = heights.length;
    Stack<Integer> stack = new Stack<>();
    int max = 0;

    for (int i = 0; i <= n; i++) {
        int curr = (i == n) ? 0 : heights[i];

        while (!stack.isEmpty() && heights[stack.peek()] >= curr) {
            int height = heights[stack.pop()];
            int right = i;
            int left = stack.isEmpty() ? -1 : stack.peek();
            int width = right - left - 1;
            max = Math.max(max, height * width);
        }

        stack.push(i);
    }

    return max; 
        
    }}
   