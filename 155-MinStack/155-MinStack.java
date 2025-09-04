// Last updated: 9/4/2025, 12:06:45 PM
class MinStack {
    class Pair{
        int first;
        int sec;
        Pair(int first,int sec){
            this.first=first;
            this.sec=sec;
        }
    }
    Stack<Pair> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val,val));
        }
        else{
            st.push(new Pair(val,Math.min(val,st.peek().sec)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().first;
    }
    
    public int getMin() {
        return st.peek().sec;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */