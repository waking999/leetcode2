package easy.e0868binarygap;

public class Solution {
    public int binaryGap(int N) {
        int start=-1;
        int end=-1;
        int maxLen=0;


        int count=0;
        while(N>0){
            int a=N%2;
            if(a==1){
                if(start==-1){
                    start=count;
                }else if(end==-1||start==end){
                    end=count;
                    int len=end-start;
                    maxLen=Math.max(len,maxLen);
                    start=end;
                }
            }
            N>>=1;
            count++;
        }

        if(start==-1||end==-1){
            return 0;
        }

        return maxLen;
    }
}
