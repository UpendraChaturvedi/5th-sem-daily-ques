// Last updated: 9/4/2025, 12:02:58 PM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String ,Integer>h=new HashMap<>();
        HashMap<String ,Integer>h1=new HashMap<>();
        
        for(String i:s1.split(" ")){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(String i:s2.split(" ")){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        
        ArrayList<String>a=new ArrayList<>();
        for(String i:s1.split(" ")){
            if(h.get(i)==1 && !h1.containsKey(i)){
                a.add(i);
            }
        }
        for(String i:s2.split(" ")){
            if(h1.get(i)==1 && !h.containsKey(i)){
                a.add(i);
            }
        }
        return a.toArray(new String[0]);

        
    }
}