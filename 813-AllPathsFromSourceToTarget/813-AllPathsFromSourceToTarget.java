// Last updated: 9/4/2025, 12:03:14 PM
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] g) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        dfs(0,g,l,l1);
        return l;
    }
    public static void dfs(int src,int g[][],List<List<Integer>>l,List<Integer>l1){
        l1.add(src);
        if (src==g.length - 1) {
            l.add(new ArrayList<>(l1));
        } else {
            for (int i :g[src]) {
                dfs(i,g,l,l1);
            }
        }
        l1.remove(l1.size()-1);
    }
}