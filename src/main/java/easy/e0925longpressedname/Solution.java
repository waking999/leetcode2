package easy.e0925longpressedname;

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int nameLen = name.length();
        int typedLen = typed.length();
        if (typedLen < nameLen) {
            return false;
        }

        char[] nameChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();

        int namePointer = 0;
        int typedPointer = 0;

        while (namePointer < nameLen && typedPointer < typedLen && typedPointer >= namePointer) {

            if (nameChars[namePointer] == typedChars[typedPointer]) {
                int nameCount=1;
                int typedCount=1;
                while (namePointer<nameLen-1&&nameChars[namePointer + 1] == nameChars[namePointer]) {
                    namePointer++;
                    nameCount++;
                }
                while (typedPointer<typedLen-1&&typedChars[typedPointer + 1] == typedChars[typedPointer]) {
                    typedPointer++;
                    typedCount++;
                }
                if (nameCount>typedCount) {
                    return false;
                }
                namePointer++;
                typedPointer++;
            } else {
                return false;
            }

        }
        return namePointer >= nameLen;
    }
}
