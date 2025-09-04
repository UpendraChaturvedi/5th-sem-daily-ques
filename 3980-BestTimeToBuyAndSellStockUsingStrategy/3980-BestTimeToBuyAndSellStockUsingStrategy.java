// Last updated: 9/4/2025, 11:58:03 AM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n=prices.length;
        long orgp=0;
        for(int i=0;i<n;i++){
            orgp+=(long)prices[i]*strategy[i];
        }
        long precontri[]=new long [n+1];
        long prepr[]=new long [n+1];
        for(int i=0;i<n;i++){
            precontri[i+1]=precontri[i]+(long)prices[i]*strategy[i];
            prepr[i+1]=prepr[i]+prices[i];
        }
        long res=orgp;
        for(int i=0;i+k<=n;i++){
            long ol = precontri[i + k] - precontri[i];
            int mid=i+k/2;
            long newcont=prepr[i+k]-prepr[mid];
            long newprofit=orgp-ol+newcont;
            res=Math.max(res,newprofit);
            
        }
        return res;
        
    }
}