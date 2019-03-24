package easy.e0706designhashmap;

import java.util.Arrays;

public class MyHashMap {
    private int[] table;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        table = new int[0];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int tableSize = table.length;
        if(table.length==0){
            table=new int[key*2];
            Arrays.fill(table,0,table.length,-1);
        }else if (key >= tableSize) {

            table=Arrays.copyOf(table,key*2);
            Arrays.fill(table,tableSize,table.length,-1);

        }
        table[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {


        int tableSize=table.length;
        if(key>tableSize){
            return -1;
        }
        return table[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int tableSize = table.length;
        if (key >= tableSize) {
            return;
        }
        table[key]=-1;
    }
}


