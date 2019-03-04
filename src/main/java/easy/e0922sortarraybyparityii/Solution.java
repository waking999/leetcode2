package easy.e0922sortarraybyparityii;




public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int aLen=A.length;

        int odd=1;
        for(int even=0;even<aLen;even+=2){
            if(!isEven(A[even])){
                while(!isEven(A[odd])){
                    odd+=2;
                }
                swap(A,odd,even);
            }


        }
        return A;
    }

    private void swap(int[] A, int i,int j){
        int tmp=A[i];
        A[i]=A[j];
        A[j]=tmp;
    }

    private boolean isEven(int a){
        return a%2==0;
    }

}
