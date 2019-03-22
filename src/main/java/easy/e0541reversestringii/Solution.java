package easy.e0541reversestringii;

public class Solution {
    public String reverseStr(String s, int k) {
        if (s == null) {
            return null;
        }
        int sLen = s.length();
        if (sLen <= 1) {
            return s;
        }
        char[] sChars = s.toCharArray();

        int groupCount = sLen / (2 * k);

        int start = 0;
        if (groupCount == 0) {
            //the whole string less than 2k
            if(sLen<=k){
                //reverse all of them
                int end = sLen - 1;
                int mid = sLen / 2;
                swap(sChars, start, end, mid);
            }else{
                //>k &&<2k, reverse the first k;
                int end = k-1;
                int mid = k / 2;
                swap(sChars, start, end, mid);
            }

        } else {
            //string longer than 2k -> reverse the groupCount of 2k substring one by one
            for (int i = 0; i < groupCount; i++) {
                start = i * 2* k;
                int end = start + k - 1;
                int mid = k / 2;
                swap(sChars, start, end, mid);
            }
            //calculate the start of remaining part since the groupCount will change later;
            start = groupCount * 2 * k;
            int remaingLen = sLen % (2 * k);

            //let's see how many groups of k length substring
            groupCount = remaingLen / k;
            if (groupCount == 0) {
                //the remaining part less than k, reverse them all
                int end =sLen-1;
                int mid = (sLen-start) / 2;
                swap(sChars, start, end, mid);

            } else {
                //the remaining part longer than k, reverse the first k characters in the remaining part
                int end = start + k - 1;
                int mid = k / 2;
                swap(sChars, start, end, mid);
            }
        }

        return new String(sChars);
    }

    private void swap(char[] sChars, int start, int end, int mid) {
        for (int j = 0; j < mid; j++) {
            char tmp = sChars[start + j];
            sChars[start + j] = sChars[end - j];
            sChars[end - j] = tmp;
        }
    }


}
