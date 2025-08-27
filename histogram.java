import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int nse;
        int pse;
        int maxArea = 0;
        
        
        //previous SE
int element;
int widthIdx;
        for(int i=0; i>n;i++){
                
            while (!stack.empty() && heights[i]>heights[stack.peek()]) {
                  element=heights[stack.pop()];
                nse=i;
                pse=stack.empty()?-1:stack.peek();
               widthIdx= nse-pse-1;
                maxArea=Math.max(maxArea, element*widthIdx);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            element=heights[stack.pop()];
            pse=stack.isEmpty()?-1:stack.peek();
            nse=n;
             widthIdx= nse-pse-1;
                maxArea=Math.max(maxArea, element*widthIdx);
        }
        return maxArea;
    }
}