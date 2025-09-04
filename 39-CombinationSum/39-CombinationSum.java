// Last updated: 9/4/2025, 12:08:20 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        Combination(coin,target,l1,0,ans);
        return ans;
        
    }
    public static void Combination(int [] coin, int amount,List<Integer>l1,int idx,List<List<Integer>>ans) {
		if(amount==0) {
			ans.add(new ArrayList<>(l1));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if(amount>= coin[i]) {
                l1.add(coin[i]);
				Combination(coin, amount-coin[i], l1, i,ans);
                l1.remove(l1.size()-1);
			}
		}
        
    }
}