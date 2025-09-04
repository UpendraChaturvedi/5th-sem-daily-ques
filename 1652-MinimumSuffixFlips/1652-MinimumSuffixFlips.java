// Last updated: 9/4/2025, 12:01:19 PM
class Solution {
    public int minFlips(String target) {
        int count=0;
        char prev='0';
        for(char c:target.toCharArray()){
            if(c!=prev){
                count+=1;
                prev=c;
            }
        }
        return count;
    }
}