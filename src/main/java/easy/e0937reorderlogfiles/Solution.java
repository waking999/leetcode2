package easy.e0937reorderlogfiles;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String[] reorderLogFiles(String[] logs) {
        int logsLen = logs.length;

        String[] digits = new String[logsLen];
        int digitsIdx = 0;

        List<Letter> letters = new ArrayList<>();

        //go through logs
        for (String log : logs) {
            if (!isLetter(log, letters)) {
                //if it is digit-log, just put aside (in a separate buffer) for future usage
                digits[digitsIdx++] = log;
            }
        }

        //sort letter-logs by text
        letters = letters.stream().sorted().collect(Collectors.toList());

        int lettersLen = letters.size();

        //put sorted letter-log into the return array
        for (int i = 0; i < lettersLen; i++) {
            Letter letter = letters.get(i);
            logs[i] = letter.id + letter.text;
        }

        //put the digit-log into the return array
        System.arraycopy(digits, 0, logs, lettersLen, digitsIdx);


        return logs;
    }

    private boolean isLetter(String log, List<Letter> letters) {
        String[] strs = log.split(" ");
        String text1 = strs[1];
        char ch = text1.charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            //if it is letter-log, put it into the wrapper class list for future sorting
            String id = strs[0];
            int idLen = id.length();
            String text = log.substring(idLen);
            letters.add(new Letter(id, text));


            return true;
        }
        return false;
    }
    //since we only order letter-log lexicographically ignoring identifier, we need a wrapper class to split the id and only compare text part
    private class Letter implements Comparable<Letter> {
        String id;
        String text;

        Letter(String id, String text) {
            this.id = id;
            this.text = text;
        }

        @Override
        public int compareTo(Letter other) {
            return this.text.compareTo(other.text);
        }
    }
}
