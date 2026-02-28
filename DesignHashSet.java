//https://leetcode.com/problems/design-hashset/?envType=problem-list-v2&envId=design
import java.util.ArrayList;
class MyHashSet {

    ArrayList<Integer> keys = new ArrayList<Integer>();

    public MyHashSet() {}
    
    public void add(int key) {
        if(!keys.contains(key)){
            keys.add(key);
        }
    }
    
    public void remove(int key) {
        if(keys.contains(key)){
            keys.remove(keys.indexOf(key));
        }
    }
    
    public boolean contains(int key) {
        return keys.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
