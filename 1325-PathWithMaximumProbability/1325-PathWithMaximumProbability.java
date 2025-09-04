// Last updated: 9/4/2025, 12:01:56 PM
import java.util.*;

class Solution {
    class Pair implements Comparable<Pair> {
        int node;
        double prob;
        
        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
        
        public int compareTo(Pair o) {
            if (this.prob == o.prob) {
                return this.node - o.node;
            }
            return Double.compare(o.prob, this.prob);
        }
    }
    
    public double maxProbability(int n, int[][] edges, double[] succ, int start, int end) {
        List<List<Pair>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            double p = succ[i];
            l.get(u).add(new Pair(v, p));
            l.get(v).add(new Pair(u, p));
        }
        
        double ans[] = new double[n];
        Arrays.fill(ans, 0.0);
        ans[start] = 1.0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(start, 1.0));
        
        while (!pq.isEmpty()) {
            Pair top = pq.remove();
            int node = top.node;
            double prob = top.prob;
            
            if (node == end) return prob;
            if (prob < ans[node]) continue;
            
            for (Pair p : l.get(node)) {
                double tot = prob * p.prob;
                if (ans[p.node] < tot) {
                    ans[p.node] = tot;
                    pq.add(new Pair(p.node, tot));
                }
            }
        }
        
        return 0.0;
    }
}
