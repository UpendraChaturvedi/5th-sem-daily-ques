// Last updated: 9/4/2025, 12:03:10 PM
import java.util.*;

class Solution {
    public String mostCommonWord(String p, String[] b) {
        Set<String> a = new HashSet<>();
        p = p.toLowerCase();
        p = p.replaceAll("[^a-z ]", " ");
        String[] arr = p.split("\\s+");

        Map<String, Integer> h = new HashMap<>();
        for (String i : b) {
            a.add(i);
        }

        for (String i : arr) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        int max = -1;
        String word = "";
        for (Map.Entry<String, Integer> e : h.entrySet()) {
            String w = e.getKey();
            int v = e.getValue();
            if (v > max && !a.contains(w)) {
                max = v;
                word = w;
            }
        }

        return word;
    }
}
