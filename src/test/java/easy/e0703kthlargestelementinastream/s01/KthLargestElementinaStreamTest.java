package easy.e0703kthlargestelementinastream.s01;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class KthLargestElementinaStreamTest {
    @Test
    public void test1(){
        int k;
        int[] arr;
        int expect;
        int output;
        int seq=1;

        k = 3;
        arr = new int[]{4,5,8,2};
        KthLargest kthLargest = new KthLargest(k, arr);

        expect=4;
        output=kthLargest.add(3);
        VerifyUtil.verify(expect,output,seq++);

        expect=5;
        output=kthLargest.add(5);
        VerifyUtil.verify(expect,output,seq++);

        expect=5;
        output=kthLargest.add(10);
        VerifyUtil.verify(expect,output,seq++);


        expect=8;
        output=kthLargest.add(9);
        VerifyUtil.verify(expect,output,seq++);


        expect=8;
        output=kthLargest.add(4);   // returns 4
        VerifyUtil.verify(expect,output,seq++);

    }

    @Test
    public void test2(){


        KthLargest s=new KthLargest(7,new int[]{-10,1,3,1,4,10,3,9,4,5,1});

        String[] operations=new String[]{"add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add"};
        int[][] params=new int[][]{{3},{2},{3},{1},{2},{4},{5},{5},{6},{7},{7},{8},{2},{3},{1},{1},{1},{10},{11},{5},{6},{2},{4},{7},{8},{5},{6}};
        runTest(s,operations,params);
    }


    @Test
    public void test3(){


        KthLargest s=new KthLargest(1,new int[]{});
        String[] operations=new String[]{"add","add","add","add","add"};
        int[][] params=new int[][]{{-3},{-2},{-4},{0},{4}};
        runTest(s,operations,params);
    }



    @Test
    public void test4(){


        KthLargest s=new KthLargest(1,new int[]{-2});
        String[] operations=new String[]{"add","add","add","add","add"};
        int[][] params=new int[][]{{-3},{0},{2},{-1},{4}};
        runTest(s,operations,params);
    }




    @Test
    public void test5(){


        KthLargest s=new KthLargest(3,new int[]{1,1});
        String[] operations=new String[]{"add","add","add","add","add","add","add","add"};
        int[][] params=new int[][]{{1},{1},{3},{3},{3},{4},{4},{4}};
        runTest(s,operations,params);
    }

    private void runTest(KthLargest s,String[] operations, int[][] params) {

        int seq = 1;

        int len = operations.length;
        for (int i = 0; i < len; i++) {
            String op = operations[i];
            int[] param = params[i];
            if ("add".equals(op)) {
                s.add(param[0]);
            }
        }
    }
}
