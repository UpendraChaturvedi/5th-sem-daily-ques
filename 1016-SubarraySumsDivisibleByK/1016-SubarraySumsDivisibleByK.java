// Last updated: 9/4/2025, 12:02:40 PM
class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        int n = k;
        long[] freq = new long[n];
        long sum = 0;
        freq[0] = 1;
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = (int) (sum % n);
            if (rem < 0) {
                rem += n;
            }
            ans += freq[rem];
            freq[rem]++;
        }
        return (int) ans;
        
    }
}