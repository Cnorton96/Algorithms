package LinkedList_Maps;
/* Write a basic implementation fo a map data structure that allows you to put, get, and remove value. You should have
   one method named put(K k, V v), one method named get(K k), and one method named remove(K k).
 */

import java.util.Arrays;

public class BasicMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private BasicMap<K, V>[] map = new BasicMap[DEFAULT_CAPACITY];

    public K key;
    public V value;

    public BasicMap(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }



    private int size;

    public void put(K key, V value){
        boolean success = true;
        for(int i=0; i<size; i++){
            if(map[i].getKey().equals(getKey())){
                map[i].setValue(value);
                success = false;
            }
        }
        if(success){
            checkCapacity();
            map[size++] = new BasicMap<>(key,value);
        }
    }

    private void checkCapacity(){
        if(size == map.length){
            int newSize = map.length * 2;
            map = Arrays.copyOf(map,newSize);
        }
    }

    public V get(K key){
        for(int i=0; i<size; i++){
            if(map[i] != null){
                if(map[i].getKey().equals(key)){
                    return map[i].getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key){
        for(int i=0; i<size; i++){
            if(map[i].getKey().equals(key)){
                map[i] = null;
                size --;
                condenseArray(i);
            }
        }
    }

    public void condenseArray(int start){
        int i;
        for(i = start; i<size; i++){
            map[i] = map[i + 1];
        }
        map[i] = null;
    }









    public static void main(String[] args){

    }
}
