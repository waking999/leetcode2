package easy.e1013pairsofsongswithtotaldurationsdivisibleby60;

public class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        if(time.length==0) return 0;
        int[] b = new int[60];
        for(int t:time){
            int j = t%60;
            b[j]=b[j]+1;
        }
        int num=0;

        if(b[0]>1) num = num + b[0]*(b[0]-1)/2;
        if(b[30]>1) num = num + b[30]*(b[30]-1)/2;

        for(int i=1;i<30;i++){
            num = num + (b[i]*b[60-i]);
        }
        return num;
    }
}
