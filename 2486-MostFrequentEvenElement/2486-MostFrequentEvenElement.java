// Last updated: 9/4/2025, 11:59:48 AM
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
        }
        int ans = -1;
    	int maxFreq = 0;
    	
    	for(int a :  hm.keySet()) {
    		
    		int freq = hm.get(a);
    		if(freq > maxFreq) {
    			maxFreq =  freq;
    			
    			ans = a;
    			
    		 }
             else if(freq == maxFreq && a < ans){
    			ans = a;
    		}
    	}
    	return ans;


        
    }
}