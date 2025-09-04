// Last updated: 9/4/2025, 12:03:19 PM
class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] c = new int[graph.length];
        Arrays.fill(c, -1);

        for (int i = 0; i < graph.length; i++) { 
            if (c[i] == -1) { 
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                c[i] = 0;

                while (!q.isEmpty()) {
                    int u = q.poll();

                    for (int v : graph[u]) { 
                        if (c[v] == -1) { 
                            c[v] = 1 - c[u];
                            q.offer(v);
                        } else if (c[v] == c[u]) { 
                            return false;
                        }
                    }
                }
            }
        }
        return true;
        
    }
}