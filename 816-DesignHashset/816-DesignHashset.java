// Last updated: 9/4/2025, 12:03:13 PM
class MyHashSet {
    HashSet<Integer>s=new HashSet<>();
    public MyHashSet() {
        
        
    }
    
    public void add(int key) {
        s.add(key);
    }
    
    public void remove(int key) {
        s.remove(key);
        
    }
    
    public boolean contains(int key) {
        return s.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */