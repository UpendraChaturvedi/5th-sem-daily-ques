// Last updated: 9/4/2025, 12:06:33 PM
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       // String s=Integer.toBinaryString(n);
    String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        int i=0;

        char arr[]=s.toCharArray();
        int j=arr.length-1;
        while(i<j){
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
            
        }
        return (int)Long.parseLong(new String(arr),2);

        
       
    }
}