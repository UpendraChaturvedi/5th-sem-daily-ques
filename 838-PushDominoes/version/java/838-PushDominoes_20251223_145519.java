// Last updated: 12/23/2025, 2:55:19 PM
1class Solution {
2    public String pushDominoes(String dominoes) {
3        int n = dominoes.length();
4        int[] forces = new int[n];
5        int force = 0;
6        for (int i = 0; i < n; i++) {
7            char c = dominoes.charAt(i);
8            if (c == 'R')
9                force = n;
10            else if (c == 'L')
11                force = 0;
12            else
13                force = Math.max(force - 1, 0);
14            forces[i] += force;
15        }
16        force = 0;
17        for (int i = n - 1; i >= 0; i--) {
18            char c = dominoes.charAt(i);
19            if (c == 'L')
20                force = n;
21            else if (c == 'R')
22                force = 0;
23            else
24                force = Math.max(force - 1, 0);
25            forces[i] -= force;
26        }
27        StringBuilder result = new StringBuilder();
28        for (int f : forces) {
29            if (f > 0)
30                result.append('R');
31            else if (f < 0)
32                result.append('L');
33            else
34                result.append('.');
35        }
36        return result.toString();
37    }
38}