// Last updated: 9/4/2025, 11:58:33 AM
class Solution {
    public int[][] sortMatrix(int[][] g) {
        int n=g.length;
        for(int c=1;c<n;c++){
            int r=0;
            int co=c;
            List<Integer>l=new ArrayList<>();
            while(r<n && co<n){
                l.add(g[r][co]);
                r++;
                co++;
            }
            Collections.sort(l);
            r=0;
            co=c;
            while(r<n && co<n){
                g[r][co]=l.get(r);
                r++;
                co++;
            }
        }
        for(int r=0;r<n;r++){
            int ro=r;
            int c=0;
            List<Integer>l=new ArrayList<>();
            while(ro<n && c<n){
                l.add(g[ro][c]);
                ro++;
                c++;
            }
            Collections.sort(l,Collections.reverseOrder());
            ro=r;
            c=0;
            while(ro<n && c<n){
                g[ro][c]=l.get(c);
                ro++;
                c++;
            }


        }
        return g;

    }
}