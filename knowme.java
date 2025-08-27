class Solution {
    public int celebrity(int[][] mat) {
        int n = mat.length;

        // Step 1: Find a candidate using elimination
        int top = 0;
        int bottom = n - 1;

        while (top < bottom) {
            
            if (knows(mat, top, bottom)) {
                top++;
            }else if (knows(mat, bottom,top)) {
                bottom--;
            }
            top++;
            bottom--;
        }

        int candidate =top;
       if(top==bottom){
         for(int i=0; i<n;i++){
            if(i!=candidate){
                continue;
            }
            if(!knows(mat, candidate, i) || knows(mat, i,candidate)){

            }else{
return -1;
            }
            
        }
       }
       return candidate;

       

       
    }

    // Helper method
    private boolean knows(int[][] mat, int a, int b) {
        return mat[a][b] == 1;
    }
}


