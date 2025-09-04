// Last updated: 9/4/2025, 12:05:07 PM
class Solution {
    public int countSegments(String s) {
        int c=0;
        // if(s==null || s.isEmpty()){
        //     return 0;
        // }

        String []a=s.split(" ");
        for(String i:a){
            if(i.isEmpty()==false){
                c++;
            }
        }
        return c;
        
    }
}