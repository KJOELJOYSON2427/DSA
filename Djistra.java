
import java.util.ArrayList;

import java.util.PriorityQueue;


public class Djistra{    

    public int[] Djis(int S,int v, ArrayList<ArrayList<ArrayList<Integer>>> graph){
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->Integer.compare(a[0], b[0])
        );

      int[]  Dist = new int[v];
      for (int i : Dist) {
        Dist[i]= Integer.MAX_VALUE;
      }

      Dist[S] =0;
      pq.add(new int[]{0,S});
      while (!pq.isEmpty()) {
         int[] curr = pq.poll();
            int dis = curr[0];
            int node = curr[1];
          for (int i=0;i< graph.get(node).size();i++) {
              int edgeWeight= graph.get(node).get(i).get(1);
              int adjNode =graph.get(node).get(i).get(0);

              if(dis + edgeWeight< Dist[adjNode]){
                Dist[adjNode]=dis+edgeWeight;
                pq.add(new int[]{Dist[adjNode], adjNode});
              }
          }
      }
      return Dist;
    }
}