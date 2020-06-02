/**
add(value)：向哈希集合中插入一个值。
contains(value) ：返回哈希集合中是否存在这个值。
remove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。

示例:

MyHashSet hashSet = new MyHashSet();
hashSet.add(1);         
hashSet.add(2);         
hashSet.contains(1);    // 返回 true
hashSet.contains(3);    // 返回 false (未找到)
hashSet.add(2);          
hashSet.contains(2);    // 返回 true
hashSet.remove(2);          
hashSet.contains(2);    // 返回  false (已经被删除)

注意：

所有的值都在 [0, 1000000]的范围内。
操作的总数目在[1, 10000]范围内。
不要使用内建的哈希集合库。

**/
import java.util.*;


class MyHashSet {

   private ArrayList<Integer> buckets[];
   
    public MyHashSet() {
        this.buckets = new ArrayList[1000];
        for (int i=0; i<1000; i++){
            this.buckets[i] = new ArrayList<Integer>();
        }
    }
    
    public void add(int key) {
        int type = key%1000;
        if(!this.buckets[type].contains(key)){
            this.buckets[type].add(key);
        }
        
    }
    
    public void remove(int key) {
        int type = key%1000;
        if(this.buckets[type].contains(key)){
            int index = this.buckets[type].indexOf(key);
            this.buckets[type].remove(index);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int type = key%1000;
        if(this.buckets[type].contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */