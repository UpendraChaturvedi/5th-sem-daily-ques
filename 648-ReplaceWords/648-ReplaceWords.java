// Last updated: 9/4/2025, 12:03:55 PM
class Solution {
    public String replaceWords(List<String> d, String sen) {
        Collections.sort(d, (a, b) -> a.length() - b.length());
        String []s=sen.split(" ");
        for(int i=0;i<s.length;i++){
            for(int j=0;j<d.size();j++){
                if (s[i].startsWith(d.get(j))) {
                    s[i] = d.get(j);
                    break;
                }
            }
        }
        return String.join(" ", s);
    }
}