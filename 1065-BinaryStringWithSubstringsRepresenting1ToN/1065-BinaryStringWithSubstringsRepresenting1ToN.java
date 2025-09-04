// Last updated: 9/4/2025, 12:02:29 PM
class Solution {
    public boolean queryString(String s, int n) {
        boolean is=true;
        for(int i=1;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            if(!s.contains(bin)) return false;
        }
        return true;
    }
}