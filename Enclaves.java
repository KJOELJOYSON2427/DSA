class Solution {
    public int numEnclaves(int[][] grid) {
       
        int m= grid.length;
        int n= grid[0].length;

        //fill the first and last column

        for(int i=0; i<m;i++){
            if(grid[i][0]==1){
                grid[i][0]=0;
                dfs(grid,i,0);
            }
            if(grid[i][m-1]==1){
                grid[i][m-1]=0;
                dfs(grid,i,m-1);
            }
        }

        //fill the column
        for(int i=0; i<n;i++){
            if(grid[0][i]==1){
                grid[0][i]=0;
                dfs(grid,0,i);
            }
            if(grid[n-1][i]==1){
                grid[n-1][i]=0;
                dfs(grid,n-1,i);
            }
        }
        CountInnerIslands(grid);

    }
    private void dfs(int[][] grid, int i, int j){
            //condition 

            if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
                return;
            }
                  

            grid[i][j]=0;
            dfs(grid, i, j+1);
            dfs(grid, i, j-1);
            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
        }


        private int CountInnerIslands(int[][] grid){
            int count=0;
            
        }
}
