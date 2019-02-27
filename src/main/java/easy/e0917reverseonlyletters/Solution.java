package easy.e0917reverseonlyletters;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] oldChars = S.toCharArray();
        int sLen = S.length();
        char[] newChars = new char[sLen];

        int frontStart = 0;
        int frontEnd = 0;
        int endStart = sLen - 1;
        int endEnd = sLen - 1;
        while (frontEnd < sLen && endEnd>=0) {
            //1. count from front, get a letter substring
            while (frontEnd < sLen && isLetter(oldChars[frontEnd])) {
                frontEnd++;
            }
            if(frontEnd>=sLen){
                frontEnd=sLen;
            }
            //2. count from end, get a letter substring
            while (endEnd >= 0 && isLetter(oldChars[endEnd])) {
                endEnd--;
            }
            if(endEnd<0){
                endEnd=0;
            }


            //if end is shorter
            while ((endStart - endEnd) <= (frontEnd - frontStart)) {
                for (int i = endStart; i > endEnd; i--) {
                    newChars[i] = oldChars[frontStart];
                    frontStart++;
                }
                if (!isLetter(oldChars[endEnd])) {
                    newChars[endEnd] = oldChars[endEnd];
                }
                endStart = endEnd - 1;
                endEnd = endStart;
                while (endEnd >= 0 && isLetter(oldChars[endEnd])) {
                    endEnd--;
                }
            }

            //if front is shorter
            while ((frontEnd - frontStart) <= (endStart - endEnd)) {
                for (int i = frontEnd - frontStart - 1; i >= 0; i--) {
                    newChars[endStart] = oldChars[frontStart];
                    endStart--;
                    frontStart++;
                }
                frontEnd++;
                frontStart = frontEnd;
                while (frontEnd < sLen && isLetter(oldChars[frontEnd])) {
                    frontEnd++;
                }
            }


        }


        return new String(newChars);


    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
