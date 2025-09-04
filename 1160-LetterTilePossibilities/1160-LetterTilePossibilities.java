// Last updated: 9/4/2025, 12:02:15 PM
class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String>ans=new HashSet<>();
        StringBuilder str = new StringBuilder();
        boolean[] used = new boolean[tiles.length()];
        subseq(tiles,ans,str,used);
        return ans.size();
    }
    public static void subseq(String tiles,Set<String>ans,StringBuilder str,boolean []used){
        for(int i=0;i<tiles.length();i++){
            if(used[i]) continue;
            used[i]=true;
            str.append(tiles.charAt(i));
            String formed = str.toString();
            ans.add(formed);
            subseq(tiles,ans,str,used);
            str.deleteCharAt(str.length()-1);
            used[i]=false;
        }

    }
}