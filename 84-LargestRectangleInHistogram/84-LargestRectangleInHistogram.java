// Last updated: 9/4/2025, 12:07:37 PM
class Solution {
    public int largestRectangleArea(int[] h) {
        return his(h);
        
        
    }
    public static int his(int [] h){
        int n=h.length;
        Stack<Integer>s=new Stack<>();
        int l[]=new int [h.length];
        int r[]=new int [h.length];
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && h[s.peek()]>=h[i]){
                s.pop();
            }
            l[i]=s.isEmpty()==true?-1:s.peek();
            s.push(i);
            
        }
        s.clear();
        
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && h[s.peek()]>=h[i]){
                s.pop();
            }
            r[i]=s.isEmpty()==true?n:s.peek();
            s.push(i);
            
        }
        int res=0;
        for(int i=0;i<n;i++){
            int w=r[i]-l[i]-1;
            res=Math.max(res,h[i]*w);
        }
        return res;
    }
}