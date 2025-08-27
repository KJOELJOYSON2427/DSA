import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class adjList {
   void adjListName(){
     Scanner sc = new Scanner(System.in);

        // Read number of nodes and edges
        int n = sc.nextInt(); // number of nodes
        int m = sc.nextInt(); // number of edges
     List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<n;i++){
            adj.add(new ArrayList<>());
        }


        for(int i=0; i<m;i++){
             int u = sc.nextInt(); // number of nodes
        int v = sc.nextInt();
            adj.get(u).add(v);
            
        }


   }
}
