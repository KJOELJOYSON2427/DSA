
import java.util.List;

import java.util.Stack;

public class kahana {
     public List<Integer> getTopo(int n, List<List<Integer>> graph) {
        Stack<Integer>  stack =new Stack<>();
        boolean []visited=new boolean[n];
        for (int i = 0; i < n; i++) {
            if(visited[i]==false){
                  stack.push(i);
                  visited[i]=true;
                 dfs(i,graph,visited,stack);
                 
            }
        }
        return stack.reversed();
    }

    private Stack<Integer> dfs(int node, List<List<Integer>> graph, boolean[] visited,Stack<Integer> stack) {
        visited[node]=true;
       for (var it : graph.get(node)) {
           if(!visited[it]){
           
             dfs(it, graph, visited, stack);
              
           }
           stack.push(it);
       }
       return stack;
    }
   
}
