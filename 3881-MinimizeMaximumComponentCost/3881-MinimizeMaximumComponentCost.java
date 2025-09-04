// Last updated: 9/4/2025, 11:58:15 AM
class Solution {
    class p implements Comparable<p> {
        int a, b;
        p(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo(p o) {
            return this.b - o.b;
        }
    }
    public int minCost(int n, int[][] e, int k) {
        ArrayList<ArrayList<p>> z = new ArrayList<>();
        for (int i = 0; i < n; i++) z.add(new ArrayList<>());
        for (int[] x : e) {
            z.get(x[0]).add(new p(x[1], x[2]));
            z.get(x[1]).add(new p(x[0], x[2]));
        }

        boolean[] u = new boolean[n];
        PriorityQueue<p> q = new PriorityQueue<>();
        ArrayList<Integer> w = new ArrayList<>();

        q.add(new p(0, 0));
        while (!q.isEmpty()) {
            p y = q.poll();
            if (u[y.a]) continue;
            u[y.a] = true;
            if (y.b != 0) w.add(y.b);
            for (p r : z.get(y.a)) {
                if (!u[r.a]) q.add(new p(r.a, r.b));
            }
        }

        Collections.sort(w, Collections.reverseOrder());
        for (int i = 0; i < k - 1 && !w.isEmpty(); i++) w.remove(0);

        return w.isEmpty() ? 0 : w.get(0);
    

    }
}