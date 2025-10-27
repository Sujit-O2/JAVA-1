import java.util.ArrayList;
import java.util.List;

class MyHashMap {
    private static final int SIZE = 1000;
    private List<List<int[]>> map;

    public MyHashMap() {
        map = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            map.add(new ArrayList<>());
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        List<int[]> bucket = map.get(index);

        for (int[] pair : bucket) {
            if (pair[0] == key) { // key exists, update value
                pair[1] = value;
                return;
            }
        }
        bucket.add(new int[]{key, value}); // add new key-value
    }

    public int get(int key) {
        int index = hash(key);
        List<int[]> bucket = map.get(index);

        for (int[] pair : bucket) {
            if (pair[0] == key) return pair[1];
        }
        return -1; // key not found
    }

    public void remove(int key) {
        int index = hash(key);
        List<int[]> bucket = map.get(index);
        bucket.removeIf(pair -> pair[0] == key);
    }
}

/**
 * Example usage:
 * MyHashMap obj = new MyHashMap();
 * obj.put(1, 10);
 * obj.put(2, 20);
 * System.out.println(obj.get(1)); // 10
 * obj.remove(1);
 * System.out.println(obj.get(1)); // -1
 */
