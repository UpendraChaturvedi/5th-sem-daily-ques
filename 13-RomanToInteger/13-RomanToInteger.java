// Last updated: 9/4/2025, 12:08:46 PM
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
    
        int n=s.length();
        int res = h.get(s.charAt(s.length() - 1));
        for(int i=n-2;i>=0;i--){
            if(h.get(s.charAt(i))<h.get(s.charAt(i+1))){
                res-=h.get(s.charAt(i));
            }
            else{
                res+=h.get(s.charAt(i));
            }
        }
        return res;
        
    }
}