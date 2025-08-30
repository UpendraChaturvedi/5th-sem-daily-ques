// Last updated: 8/30/2025, 10:49:08 PM
class Solution {
    public int ladderLength(String beginWord, String end, List<String> wordList) {
        HashSet<String>h=new HashSet<>(wordList);
        if(!wordList.contains(end)) return 0;
        if(beginWord.equals(end)) return 0;
        int lev=1;
        Queue<String>q=new LinkedList<>();
        q.offer(beginWord);
        h.remove(beginWord);
        while(!q.isEmpty()){
            int sz=q.size();
            for(int k=0;k<sz;k++){
                String s=q.poll();
            if(s.equals(end)) return lev;
            for(int i=0;i<s.length();i++){
                for(char c='a';c<='z';c++){
                    if (s.charAt(i) == c) continue;
                    String sn=s.substring(0,i)+c+s.substring(i+1);
                    if(h.contains(sn)){
                        q.add(sn);
                        h.remove(sn);
                    }
                }
            }
            }
            lev++;
        }
        return 0;
    }
}