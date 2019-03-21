package easy.e1012complementofbase10integer;

public class Solution {
    public int bitwiseComplement(int N) {
        if (N==0||N==1){
            return 1-N;
        }

        int power=1;

        while(power<=N){
            power=power<<1;
        }



        return power-1-N;
    }
}
