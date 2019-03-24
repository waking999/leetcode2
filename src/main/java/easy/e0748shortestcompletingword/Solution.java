package easy.e0748shortestcompletingword;

import java.util.Arrays;

public class Solution {
    private static final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

    public String shortestCompletingWord(String licensePlate, String[] words) {

        long platePrd = getProduct(licensePlate.toLowerCase());
        char[] shortest = new char[16];
        Arrays.fill(shortest, 'a');
        String shortestStr = new String(shortest);
        for (String word : words) {
            if (word.length() < shortestStr.length() && getProduct(word) % platePrd == 0) {
                shortestStr = word;
            }

        }


        return shortestStr;
    }

    private long getProduct(String str) {
        long prd = 1L;
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            if (index >= 0 && index <= 25) {
                prd *= primes[index];
            }
        }
        return prd;
    }
}
