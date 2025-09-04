// Last updated: 9/4/2025, 12:07:10 PM
class Solution {
    public List<Integer> getRow(int num) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=num+1;i++){
            List<Integer>l=new ArrayList<>();
            if(i==1){
                l.add(1);
            }
            else{
                l.add(1);
                List<Integer>l1=ans.get(ans.size()-1);
                for(int j=0;j<l1.size()-1;j++){
                    int s=l1.get(j)+l1.get(j+1);
                    l.add(s);
                }
                l.add(1);
            }
            ans.add(l);
        }
        return ans.get(num);
    }
}