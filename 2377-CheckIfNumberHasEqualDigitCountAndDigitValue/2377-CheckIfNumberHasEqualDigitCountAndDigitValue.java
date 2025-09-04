// Last updated: 9/4/2025, 12:00:03 PM
class Solution {
    public boolean digitCount(String num) {
        int n=num.length();
        HashMap<Character,Integer>h=new HashMap<>();
        for(char i:num.toCharArray()){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        boolean is=true;
        for(int i=0;i<n;i++){
            int a = ((int) num.charAt(i)) - 48; 
            int freq = h.getOrDefault((char)(i + '0'), 0);
            if(a!=freq){
                is=false;
            }
        }
        return is==true?true:false;
    }
}