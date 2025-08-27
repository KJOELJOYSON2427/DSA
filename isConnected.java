import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findCircleNum(int[][] isConnected) {
      List<ArrayList<Integer>> adjLis=  adjacentMatrixToList(isConnected);
           
       boolean isVisited[] = new boolean[isConnected.length] ;
 int count=0;

 for(int i=0; i<isConnected.length;i++){

    if(!isVisited[i]){
        count++;
        Dfs(adjLis.get(i),adjLis,isVisited);
    }
 }
 return count;
    }

    private void Dfs(ArrayList<Integer> arrayList, List<ArrayList<Integer>> adjLis, boolean[] isVisited) {
             

        for(int neighbour: arrayList){
            if(!isVisited[neighbour]){
                isVisited[neighbour]=true;
                Dfs(adjLis.get(neighbour), adjLis, isVisited);
            }
        }
    }

    private List<ArrayList<Integer>> adjacentMatrixToList(int[][] isConnected) {
        
        
List<ArrayList<Integer>> adjLis = new ArrayList<>();

        // Initialize each inner list
        for (int i = 0; i < isConnected.length; i++) {
            adjLis.add(new ArrayList<>());
        }
        for(int i=0; i<isConnected.length;i++){
            for(int j=0; j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                  adjLis.get(i).add(j);
                }
            }
        }
        return adjLis;
    }
}