// Last updated: 9/4/2025, 12:06:40 PM
class Solution {
    public int[] twoSum(int[] num, int tar) {
        int l=0;
        int h=num.length-1;
        while(l<h){
            int s = num[l]+num[h];
            if(s==tar){
                return new int []{l+1,h+1};
            }
            else if(s>tar){
                h--;
            }
            else{
                l++;
            }
        }
        return new int []{-1,-1};
        
    }
}