// Last updated: 9/4/2025, 12:03:51 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int v=0;
        int h=0;
        for(char m:moves.toCharArray()){
            if(m=='U'){
                v++;
            }
            else if(m=='D') v--;
            else if(m=='L') h++;
            else if(m=='R') h--;
        }
        return v == 0 && h == 0;
        
    }
}