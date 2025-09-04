// Last updated: 9/4/2025, 12:06:59 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0,total=0,ind=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            int cns=gas[i]-cost[i];
            tank+=cns;
            if(tank<0){
                ind=i+1;
                tank=0;
            }
            total+=cns;
        }
        return total<0?-1:ind;
        
    }
}