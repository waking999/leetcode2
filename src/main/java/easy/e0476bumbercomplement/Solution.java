package easy.e0476bumbercomplement;

public class Solution {
    public int findComplement(int num) {
        int count=0;
        int origine=num;
        while(num!=0) {
            num=num/2;
            count++;
        }

        long xor=1<<count;
        xor-=1;

        return origine^(int)xor;

    }
}
