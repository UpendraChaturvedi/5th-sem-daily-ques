// Last updated: 9/4/2025, 11:59:57 AM
class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,ArrayList<Integer>>h=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(h.containsKey(ch)){
                h.get(ch).add(i);
            }
            else{
                ArrayList<Integer>list=new ArrayList<>();
                list.add(i);
                h.put(ch,list);
            }
        }
        char ans=0;
        int ind=Integer.MAX_VALUE;
        for(char c:h.keySet()){
            ArrayList<Integer>l=h.get(c);
            if(l.size()>=2){
                if(l.get(1)<ind){
                    ind=l.get(1);
                    ans=c;
                }
            }
        }
        return ans;
    }
}