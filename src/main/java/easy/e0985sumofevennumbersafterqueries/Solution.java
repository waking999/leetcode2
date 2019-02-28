package easy.e0985sumofevennumbersafterqueries;

public class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int qLen=queries.length;
        int[] rtn=new int[qLen];
        int sum=0;

        for (int i1 : A) {
            if (isEven(i1)) {
                sum += i1;
            }
        }

        for(int i=0;i<qLen;i++){
            int[] q=queries[i];
            int idx=q[1];
            int newAdd=q[0];

            if(isEven(A[idx])&&isEven(newAdd)){
                //origin is even, newAdd is even
                //sum only add the newAdd since the origin has been summed.
                sum+=newAdd;
            }else  if(isEven(A[idx])&&!isEven(newAdd)){
                //origin is even, newAdd is odd
                //sum needs to remove the origin part
                sum-=A[idx];
            }else  if(!isEven(A[idx])&&!isEven(newAdd)){
                //origin is odd, newAdd is odd
                //sum only add both origin and newAdd
                sum+=(A[idx]+newAdd);
            }else{
                //origin is odd, newAdd is odd
                //do nothing to sum
            }
            A[idx]+=newAdd;
            rtn[i]=sum;
        }


        return rtn;
    }

    private boolean isEven(int a){
        return  a%2==0;
    }
}
