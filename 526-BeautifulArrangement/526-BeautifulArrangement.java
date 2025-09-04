// Last updated: 9/4/2025, 12:04:27 PM
class Solution {
    int c=0;
    public int countArrangement(int n) {
        ArrayList<Integer> curr = new ArrayList<>();
        backtrack(n, 1, curr);
        return c;
    }
     public void backtrack(int n, int pos, ArrayList<Integer> curr) {
        if(pos>n){
            c++;
            return;
        }
        for(int i=1;i<=n;i++){
            if (!curr.contains(i) && (i % pos == 0 || pos % i == 0)) {
                curr.add(i);
                backtrack(n, pos + 1, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
}