package easy.e0599minimumindexsumoftwolists;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MinimumIndexSumofTwoListsTest {
    @Test
    public   void test1( ) {
        Solution s = new Solution();

        String[] list1;
        String[] list2;
        String[] expect;
        String[] output;
        int seq=1;

        list1 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        list2 = new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
        expect = new String[] { "Shogun" };
        output = s.findRestaurant(list1, list2);
        VerifyUtil.verifySort(expect,output,seq++);



        list1 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        list2 = new String[] { "KFC", "Shogun", "Burger King" };
        expect = new String[] { "Shogun" };
        output = s.findRestaurant(list1, list2);
        VerifyUtil.verifySort(expect,output,seq++);

        list1 = new String[] { "Shogun", "KFC", "Tapioca Express", "Burger King" };
        list2 = new String[] { "KFC", "Shogun", "Burger King" };
        expect = new String[] { "Shogun", "KFC" };
        output = s.findRestaurant(list1, list2);
        VerifyUtil.verifySort(expect,output,seq++);

        list1 = new String[] { "vacag", "KFC" };
        list2 = new String[] { "fvo", "xrljq", "jrl", "KFC" };
        expect = new String[] { "KFC" };
        output = s.findRestaurant(list1, list2);
        VerifyUtil.verifySort(expect,output,seq++);

    }
}
