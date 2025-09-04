// Last updated: 9/4/2025, 11:59:53 AM
class Solution {
    public String smallestNumber(String str) {
        int c=1;
        int arr[]=new int [str.length()+1];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<=str.length();i++){
            if(i==str.length() || str.charAt(i)=='I'){
                arr[i]=c++;
                while(!s.isEmpty()){
                    arr[s.pop()]=c++;
                }
            }
            else{
                s.push(i);
            }
        }
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            s1.append(arr[i]);
        }
        return s1.toString();  
    }
}