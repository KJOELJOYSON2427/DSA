import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphCycleDFS {
    public boolean hasCycleDFS(int n, List<List<Integer>> graph) {
        boolean []visited=new boolean[n];
        for (int i = 0; i < n; i++) {
            if(visited[i]==false){
                if(dfs(i,n,graph,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int n, List<List<Integer>> graph, boolean[] visited) {
       Queue<int[]> queue = new LinkedList<>();
       queue.add(new int[]{i,-1});
       visited[i]=true;
       while (!queue.isEmpty()) {
               int node= queue.peek()[0];
               int parent =queue.peek()[1];
               queue.poll();
               for (int adjNode : graph.get(node)) {
                     if(!visited[adjNode]){
                        visited[adjNode]=true;
                        queue.add(new int[]{adjNode,node});

                     }else if(parent!=adjNode){
                         return true;
                     }
               }
       }
        return false;
    }
   
          
}