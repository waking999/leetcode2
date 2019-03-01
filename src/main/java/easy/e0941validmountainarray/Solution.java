package easy.e0941validmountainarray;

public class Solution {
    public boolean validMountainArray(int[] A) {
        int aLen = A.length;

        if (aLen < 3) {
            //if length less than 3, false
            return false;
        }
        if (A[0] >= A[1]) {
            //if the 2nd is less than or equals to 1st, false;
            return false;
        }

        if (A[aLen - 2] <= A[aLen - 1]) {
            //if the 2nd last is less than or equals to 1st last, false
            return false;
        }

        //the pointer from front until meeting a decrease
        int front = 0;
        while (front < aLen - 2 && A[front] < A[front + 1]) {
            front++;
        }
        //back to the position just less than the peak
        front--;

        //if this position equals the peak, false;
        if (A[front] == A[front + 1]) {
            return false;
        }

        //similar, the pointer from end until meeting an increase
        int end = aLen - 1;
        while (end >= 1 && A[end - 1] > A[end]) {
            end--;
        }
        //back to the position just less than the peak
        end++;
        //if this position equals the peak, false;
        if (A[end - 1] == A[end]) {
            return false;
        }

        //the front position, peak, the end position, so if the front = end -2, it is a mountain array, otherwise false;
        return front == end - 2;


    }
}
