// Last updated: 9/4/2025, 12:01:10 PM
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean>ans=new ArrayList<>();
        int n=l.length;
        for(int i=0;i<n;i++){
            int st=l[i];
            int en=r[i];
            ArrayList<Integer>a=new ArrayList<>();
            for(int j=st;j<=en;j++){
                a.add(nums[j]);
            }
            Collections.sort(a);
            boolean ok = true;
            int diff = a.get(1) - a.get(0);

            for (int x = 1; x < a.size() - 1; x++) {
                if (a.get(x + 1) - a.get(x) != diff) {
                    ok = false;
                    break;
                }
            }

            ans.add(ok);
        }
        return ans;
    }
}