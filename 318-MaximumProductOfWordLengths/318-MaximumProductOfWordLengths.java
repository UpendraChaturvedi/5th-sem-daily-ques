// Last updated: 9/4/2025, 12:05:43 PM
class Solution {
    public int maxProduct(String[] w) {
        int mx=0;
        int n=w.length;
        for(int i=0;i<n-1;i++){
            HashSet<Character>h1=new HashSet<>();
            for(char x:w[i].toCharArray()){
                h1.add(x);
            }
            for(int j=i+1;j<n;j++){
            boolean found=false;
                HashSet<Character>h2=new HashSet<>();
                for(char z:w[j].toCharArray()){
                    if(h1.contains(z)){
                        found=true;
                        break;
                    }
                }
                if(!found){
                    mx=Math.max(mx,w[i].length()*w[j].length());
                
                }
            }
        }
        return mx;
    }
}