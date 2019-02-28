package easy.e0989addtoarrayformofinteger;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {

        int aLen=A.length;
        int i=aLen-1;
        int carrier=0;
        while(i>=0&&K>0){
            int add=K%10;
            K=K/10;
            int sum=A[i]+add+carrier;
            carrier=sum/10;
            A[i]=sum%10;
            i--;
        }


        if(i<0&&K==0){
           //A is the same long as K
            return addToList(A, aLen, carrier);
        }else if(i>=0&&K==0){
            //A is longer than K
            while(i>=0&&carrier>0){
                int sum=A[i]+carrier;
                carrier=sum/10;
                A[i]=sum%10;
                i--;
            }

            return addToList(A, aLen, carrier);
        }else{
            //K is longer than A
            List<Integer> tmp=new ArrayList<>();
            while(K>0){
                int add=K%10;
                K=K/10;
                int sum=add+carrier;
                carrier=sum/10;
                tmp.add(sum%10);
            }
            List<Integer> rtn=new ArrayList<>();
            if(carrier>0){
                rtn.add(carrier);
            }
            int tmpLen=tmp.size();
            for(int j=tmpLen-1;j>=0;j--){
                rtn.add(tmp.get(j));
            }
            for (int i1 : A) {
                rtn.add(i1);
            }
            return rtn;
        }



    }

    private List<Integer> addToList(int[] A, int aLen, int carrier) {
        List<Integer> rtn = new ArrayList<>();
        if (carrier > 0) {
            rtn.add(carrier);
        }
        for (int j = 0; j < aLen; j++) {
            rtn.add(A[j]);
        }
        return rtn;
    }
}
