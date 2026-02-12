// Last updated: 2/12/2026, 11:27:00 AM
1class Solution {
2    public int longestBalanced(String s) {
3        int len=0;
4        int n=s.length();
5        // HashMap<Character,Integer>h=new HashMap<>();
6        for(int i=0;i<n;i++){
7            int freq[]=new int [26];
8            for(int j=i;j<n;j++){
9                char c=s.charAt(j);
10                freq[c-'a']++;
11                if(iseq(freq)){
12                    len=Math.max(len,j-i+1);
13                }
14            }
15        }
16        return len;
17    }
18    public static boolean iseq(int []freq){
19        int t=0;
20        for(int i:freq){
21            if(i!=0){
22                if(t==0) t=i;
23                else if(i!=t)return false;
24            }
25        }
26        return true;
27    }
28}