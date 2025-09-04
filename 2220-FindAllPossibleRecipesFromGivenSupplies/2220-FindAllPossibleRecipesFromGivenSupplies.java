// Last updated: 9/4/2025, 12:00:16 PM
class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        // ArrayList<String> ans = new ArrayList<>();
        // HashSet<String> a = new HashSet<>(Arrays.asList(supplies)); 

        // for (int i = 0; i < recipes.length; i++) {
        //     boolean is = true;
        //     List<String> b = ingredients.get(i);
        //     for (String c : b) {
        //         if (!a.contains(c)) {
        //             is = false;
        //             break;
        //         }
        //     }
        //     if (is) {
        //         ans.add(recipes[i]);
        //         a.add(recipes[i]); 
        //     }
        // }

        // return ans;
        ArrayList<String> ans = new ArrayList<>();
        HashSet<String> a = new HashSet<>(Arrays.asList(supplies));

        boolean addedNewRecipe;
        do {
            addedNewRecipe = false;
            for (int i = 0; i < recipes.length; i++) {
                if (!a.contains(recipes[i])) {
                    boolean is = true;
                    List<String> b = ingredients.get(i);
                    for (String c : b) {
                        if (!a.contains(c)) {
                            is = false;
                            break;
                        }
                    }
                    if (is) {
                        ans.add(recipes[i]);
                        a.add(recipes[i]);
                        addedNewRecipe = true;
                    }
                }
            }
        } while (addedNewRecipe);

        return ans;
        
    }
}