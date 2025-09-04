// Last updated: 9/4/2025, 12:06:26 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shifts=0;
        while(left<right){
            left=left>>1;
            right=right>>1;
            shifts++;

        }
        return left<<shifts;
    }
}