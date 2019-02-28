package easy.e0984stringwithoutaaaorbbb;

public class Solution {
    public String strWithout3a3b(int A, int B) {

        char shorterChar, longerChar;
        int longer, shorter;
        if (A >= B) {
            shorterChar = 'b';
            longerChar = 'a';
            longer = A;
            shorter = B;
        } else {
            shorterChar = 'a';
            longerChar = 'b';
            longer = B;
            shorter = A;
        }


        //it must be shorter<=longer<=2*shorter+2, otherwise there will not be valid string
        StringBuilder sb = new StringBuilder();
        if (longer >= 2 * shorter && longer <= 2 * shorter + 2) {
            //longer >= 2 * shorter => like aabaabaabaab...aab if A>=B, and then append the remaining a to the string, like aabaabaabaab...aabaa
            for (int i = 0; i < shorter; i++) {
                sb.append(longerChar).append(longerChar).append(shorterChar);
            }
              longer -=  2 * shorter;
            for (int i = 0; i < longer; i++) {
                sb.append(longerChar);
            }
            return sb.toString();
        } else {
            //longer>=shorter&&longer<=2shorter => like abababab...ab if A>=B, and then insert a into the string,like aabaababab...ab
            while (longer >= 1 && shorter >= 1) {
                sb.append(longerChar).append(shorterChar);
                longer --;
                shorter --;
            }
            int offset=1;
            for(int i=0;i<longer;i++){
                sb.insert(offset,longerChar);
                offset+=3;
            }
            return sb.toString();
        }

    }
}
