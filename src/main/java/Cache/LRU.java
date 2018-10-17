package Cache;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUMap<K, V> extends LinkedHashMap<K, V> {
    private final int MAX_NUM;

    public LRUMap(int capacity) {
        super(capacity);
        MAX_NUM = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry eldest) {
        return /*true*/ size() > MAX_NUM;
    }

}

public class LRU {

    LRUMap<Integer, Integer> map;

    public LRU(int capacity) {
        map = new LRUMap<Integer, Integer>(capacity);
    }

    public int get(int key) {
        if (map == null || map.get(key) == null)
            return -1;
        int value = map.get(key);
        map.remove(key);
        map.put(key, value);
        return value;
    }

    public void set(int key, int value) {
        if (map == null) return;
        get(key);
        map.put(key, value);
    }


    public static void main(String[] args) {
        LRU lru = new LRU(2);
        lru.set(10, 15);
        lru.set(11, 17);
        System.out.println(lru.get(10));
        lru.set(14, 18);
        System.out.println(lru.get(10));
        System.out.println(lru.get(11));
        System.out.println(lru.get(14));
    }
}
