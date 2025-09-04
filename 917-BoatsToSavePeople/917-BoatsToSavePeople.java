// Last updated: 9/4/2025, 12:02:59 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        int l=0;
        int n=people.length;
        int h=n-1;
        Arrays.sort(people);
        while(l<=h){
            if(people[l]+people[h]<=limit){
                // c++;
                l++;
               
            }
            h--;
            c++;
            
        }
        return c;
        
    }
}