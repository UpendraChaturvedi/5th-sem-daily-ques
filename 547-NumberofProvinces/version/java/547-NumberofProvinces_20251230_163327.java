// Last updated: 12/30/2025, 4:33:27 PM
1class Solution {
2    public int findCircleNum(int[][] iscon) {
3        int c=0;
4        int n=iscon.length;
5        boolean vis[]=new boolean [n];
6        for(int i=0;i<n;i++){
7            if(!vis[i]){
8                dfs(i,vis,iscon);
9                c++;
10            }
11        }
12        return c;
13    }
14    public static void dfs(int i,boolean vis[],int [][]iscon){
15        vis[i]=true;
16        for(int j=0;j<iscon[0].length;j++){
17            if(!vis[j]==true && iscon[i][j]==1){
18                dfs(j,vis,iscon);
19            }
20        }
21    }
22}