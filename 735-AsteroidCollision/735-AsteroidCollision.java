// Last updated: 9/4/2025, 12:03:34 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int i:asteroids){
            if(i>0) st.push(i);
            else{
                
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(i)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(i)){
                st.pop();
                }
                else if(st.isEmpty() || st.peek()<0 ){
                st.push(i);
                }
            
            }
        }
        int size = st.size();
        int[] arr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
        arr[i] = st.pop();
        }
        return arr;
    }
}