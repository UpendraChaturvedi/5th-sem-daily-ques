// Last updated: 9/4/2025, 12:03:33 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>st=new Stack<>();
        int n=temp.length;
        int arr[]=new int [n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            arr[i]=st.isEmpty()?0:st.peek()-i;
            st.push(i);
        }
        return arr;
    }
}