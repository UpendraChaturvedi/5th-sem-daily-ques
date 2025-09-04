// Last updated: 9/4/2025, 12:03:46 PM
class MapSum {
    HashMap<String,Integer>h;
    
    public MapSum() {
        
        h=new HashMap<>();
    }
    
    public void insert(String key, int val) {
        h.put(key,val);

    }
    
    public int sum(String prefix) {
        int s=0;
        for(String i:h.keySet()){
            int v=h.get(i);
            if(i.startsWith(prefix)){
                s+=v;
            }
        }
        return s;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */