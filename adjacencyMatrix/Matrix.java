import java.util.Scanner;

public class Matrix {

    void adjacencyMatrix() {
        Scanner sc = new Scanner(System.in);

        // Read number of nodes and edges
        int n = sc.nextInt(); // number of nodes
        int m = sc.nextInt(); // number of edges

        int[][] adj = new int[n + 1][n + 1]; // 1-based indexing

        // Read m edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1; // For undirected graph
        }

        // Print the adjacency matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.adjacencyMatrix();
    }
}
