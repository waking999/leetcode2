package easy.e0706designhashmap;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class DesignHashMapTest {
    @Test
    public void test1() {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.get(1);            // returns 1
        hashMap.get(3);            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        hashMap.get(2);            // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        hashMap.get(2);            // returns -1 (not found)
    }
    


    @Test
    public void test2() {
        String[] operations = new String[]{"MyHashMap","put","put","get","get","put","get", "remove", "get"};
        int[][] params = new int[][]{{},{1,1},{2,2},{1},{3},{2,1},{2},{2},{2}};
        Integer[] expects = new Integer[]{null,null,null,1,-1,null,1,null,-1};
        runTest(operations, params, expects);
    }

    private void runTest(String[] operations, int[][] params, Integer[] expects) {
        MyHashMap map = null;
        int seq = 1;

        int len = operations.length;
        for (int i = 0; i < len; i++) {
            String op = operations[i];
            int[] param = params[i];
            if ("MyHashMap".equals(op)) {
                map = new MyHashMap();
            } else if ("put".equals(op)) {
                map.put(param[0], param[1]);
            } else if ("get".equals(op)) {
                int output = map.get(param[0]);
                int expect = expects[i];
                VerifyUtil.verify(expect, output, seq++);
            } else if ("remove".equals(op)) {
                map.remove(param[0]);
            }
        }

    }

}
