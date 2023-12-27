package lessson22;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashMap<K, V> {
      MyHashMap.Node<K, V>[] table;
    int currentIndex;

    public MyHashMap() {
        table = new MyHashMap.Node[10];
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Lol1", 1);
        myHashMap.put("Lol", 11);
        myHashMap.put("Lol2", 1);

        System.out.println(myHashMap);

        byte a = 0b110;
        System.out.println(Integer.toBinaryString(a << 1));
    }

    V put(K k, V v) {
        table[index(k)] = new Node<>(hash(k), k, v);
        return v;
    }

    int index(K k) {
        for (int i = 0; i < currentIndex; i++) {
            if (table[i].key.equals(k)) {
                return i;
            }
        }
        return currentIndex++;
    }

    boolean hasKey(K key) {
        for (Node<K, V> node : table) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    int hash(K k) {
        int h;
        return (k == null) ? 0 : (h = k.hashCode()) ^ (h >>> 16);
    }

    @Override
    public String toString() {
        return Arrays.toString(table);
    }

    static class Node<K, V> {

        int hash;
        K key;
        V value;
        Node next;

        public Node(int hash, K key, V value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

    }
}
