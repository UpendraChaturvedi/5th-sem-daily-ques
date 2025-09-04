// Last updated: 9/4/2025, 12:03:47 PM
class Solution {
    public int maximumSwap(int num) {
        String s=num+"";
        int n = s.length();
        String org=s;
        int totswap=0;
        for(int i=0;i<n-1;i++){
            int max=s.charAt(i);
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(s.charAt(j)>=max){
                    max=s.charAt(j);
                    idx=j;
                }
            }
        
            if (idx != i && s.charAt(idx) > s.charAt(i)) {
                    char[] arr = s.toCharArray();
                    char temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                    org = new String(arr);
                    break;
            }
        }
        return Integer.parseInt(org);
    }
}