package easy.e0557reversewordsinastringiii;

public class Solution {
    public String reverseWords(String s) {

        if (s == null) {
            return null;
        }
        int sLen = s.length();
        if (sLen <= 1) {
            return s;
        }

        char[] chars=s.toCharArray();
        int start=0;
        int end=s.indexOf(" ");
        while(end!=-1){
            int mid=(end-start)/2;
            swap(chars, start, end, mid);
            start=end+1;
            end=s.indexOf(" ",start);
        }
        int mid=(sLen-start)/2;
        swap(chars, start, sLen, mid);


        return new String(chars);
    }

    private void swap(char[] chars, int start, int end, int mid) {
        for (int i = 0; i < mid; i++) {
            char tmp = chars[start + i];
            chars[start + i] = chars[end - 1 - i];
            chars[end - 1 - i] = tmp;
        }
    }
}
