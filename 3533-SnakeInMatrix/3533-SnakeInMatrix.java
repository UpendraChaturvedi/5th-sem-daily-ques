// Last updated: 9/4/2025, 11:58:49 AM
class Solution {
    public int finalPositionOfSnake(int n, List<String> c) {
        int i=0;
        int j=0;
        for(String s:c){
            if(s.equals("UP")){
                i--;
            }
            if(s.equals("RIGHT")){
                j++;
            }
            if(s.equals("DOWN")){
                i++;
            }
            else if (s.equals("LEFT")) { 
                j--;
            }
        }
        return (i*n)+j;
        
    }
}