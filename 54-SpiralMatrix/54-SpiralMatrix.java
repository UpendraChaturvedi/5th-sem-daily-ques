// Last updated: 9/4/2025, 12:08:05 PM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        if (arr.length == 0) return result;
        int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
        int totalElements = arr.length * arr[0].length, count = 0;
        while (count < totalElements) {
            for (int i = minc; i <= maxc && count < totalElements; i++) {
                result.add(arr[minr][i]);
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && count < totalElements; i++) {
                result.add(arr[i][maxc]);
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && count < totalElements; i--) {
                result.add(arr[maxr][i]);
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < totalElements; i--) {
                result.add(arr[i][minc]);
                count++;
            }
            minc++;
        }
        return result;
        
    }
}