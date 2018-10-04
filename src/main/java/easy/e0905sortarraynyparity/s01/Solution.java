package easy.e0905sortarraynyparity.s01;

public class Solution {
    public int[] sortArrayByParity(int[] A) {

        int front = 0;
        int rear = A.length - 1;
        int tmp;
        while (front < rear) {
            while (front < rear && A[front] % 2 == 0) {
                front++;
            }

            while (front < rear && A[rear] % 2 != 0) {
                rear--;
            }
            if (front < rear) {
                tmp = A[front];
                A[front] = A[rear];
                A[rear] = tmp;
                front++;
                rear--;
            }
        }
        return A;
    }
}
