// Last updated: 9/4/2025, 12:02:35 PM
class Solution {
    public int orangesRotting(int[][] g) {
        int n = g.length;
        int m = g[0].length;
        int fc = 0;
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1) {
                    fc++;
                } else if (g[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }
        
        if (fc == 0) return 0;
        
        int t = 0;
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        while (!q.isEmpty()) {
            int s = q.size();
            boolean changed = false;
            
            for (int i = 0; i < s; i++) {
                int[] rottenLoc = q.poll();
                int r = rottenLoc[0], c = rottenLoc[1];
                
                for (int[] d : directions) {
                    int nr = r + d[0], nc = c + d[1];
                    
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m && g[nr][nc] == 1) {
                        q.offer(new int[]{nr, nc});
                        g[nr][nc] = 2;
                        fc--;
                        changed = true;
                    }
                }
            }
            
            if (changed) t++;
        }
        
        return fc == 0 ? t : -1;
    }
}