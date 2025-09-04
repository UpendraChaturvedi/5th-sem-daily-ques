// Last updated: 9/4/2025, 12:03:29 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        List <Integer>partions=new ArrayList<>();
        for(int i=0;i<s.length();){
            int startind=i;
            int endind=s.lastIndexOf(s.charAt(i));
            for(int a=startind+1;a<=endind;a++){
                int lastind=s.lastIndexOf(s.charAt(a));
                if(lastind>endind){
                    endind=lastind;
                }
            }
            partions.add(endind-startind+1);
            i=endind+1;
        }
        return partions;
        
    }
}