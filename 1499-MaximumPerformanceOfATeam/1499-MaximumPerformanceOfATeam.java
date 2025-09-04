// Last updated: 9/4/2025, 12:01:36 PM
class Pair{
    int sp;
    int ef;
    public Pair(int sp,int ef){
        this.sp=sp;
        this.ef=ef;
    }
}

class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        ArrayList<Pair>a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Pair(speed[i], efficiency[i]));
        }
        Collections.sort(a, (p1, p2) -> Integer.compare(p2.ef, p1.ef));
        PriorityQueue<Integer>p=new PriorityQueue<>();
        long s=0;
        long min=Long.MAX_VALUE;
        long maxper=0;
        for(Pair i:a){
            p.add(i.sp);
            s+=i.sp;
            if(p.size()>k){
                s-=p.poll();
            }
            min=i.ef;
            maxper = Math.max(maxper, s * min);
        }
        return (int) (maxper % 1_000_000_007);
    }
}