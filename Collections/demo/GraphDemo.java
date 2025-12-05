import java.util.*;

public class GraphDemo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // Graph is 1->2->3->(4, 5) three nodes and two edges
        int n = 7, m = 2;
        for (int i = 0; i<=n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        //Edge 1->2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //Edge 2->3
        adj.get(3).add(2);
        adj.get(2).add(3);

        //Edge 3->4
        adj.get(3).add(4);
        adj.get(4).add(3);

        //Edge 3->5
        adj.get(3).add(5);
        adj.get(5).add(3);

        //Nodes 6, 7 are separate components not connected to the other component
        //Edge 8->9
        adj.get(6).add(7);
        adj.get(7).add(6);

        //Printing the graph
        // for (int i = 1; i<= n; i++) {
        //     for (int j = 0; j< adj.get(i).size(); j++) {
        //         System.out.print("node "+i + " connected to node "+adj.get(i).get(j)+  " ");
        //     }
        //     System.out.println();
        // }

        ArrayList<Integer> bfsPrint = bsfOfGraph(n, adj);
        System.out.println(bfsPrint);
    }

    public static ArrayList<Integer> bsfOfGraph(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[n+1];

        // Works only for connected graph
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // visited[1] = true;

        // while (!q.isEmpty()) {
        //     int node = q.poll();
        //     bfs.add(node);
        //     for (int neighbor : adj.get(node)) {
        //         if (!visited[neighbor]) {
        //             visited[neighbor] = true;
        //             q.add(neighbor);
        //         }
        //     }
        // }


        //Works for both connected and not connected graphs
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    int node = q.poll();
                    bfs.add(node);

                    for (int neighbor : adj.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            q.add(neighbor);
                        }
                    }
                }
            }
        }
        return bfs;
    }
}
