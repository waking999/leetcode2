package medium.m0394decodestring;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    private int count;
    private int pos;

    public String decodeString(String s) {
        char[] chars = s.toCharArray();
        int charsLen = chars.length;

        Stack<Integer> countStack = new Stack<>();
        Stack<Character> parentheisStack = new Stack<>();
        Stack<String> subStrStack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        pos = 0;
        int prePos = pos;

        while (pos < charsLen) {
            if(chars[pos]!=']') {
                count = 0;
                getCount(chars, pos, charsLen);
                if (pos == prePos) {
                    //can't find number
                    getSubStr(chars, pos, charsLen);
                    String tmpStr=new String(Arrays.copyOfRange(chars, prePos, pos));
                    if(parentheisStack.isEmpty()) {
                        sb.append(tmpStr);
                    }else{
                        String tmpSubStr=subStrStack.pop();
                        subStrStack.push(tmpSubStr+tmpStr);
                    }

                } else {
                    //can find a number;
                    if(count==0){
                        getSubStr(  chars, pos, charsLen);
                        String tmpStr = new String(Arrays.copyOfRange(chars, prePos, pos));
                        sb.append(tmpStr);
                    }else{
                        countStack.push(count);
                        prePos=pos+1;
                        getSubStr(  chars, prePos, charsLen);
                        String tmpStr = new String(Arrays.copyOfRange(chars, prePos, pos));
                        subStrStack.push(tmpStr);
                        parentheisStack.push('[');
                    }

                }

            }else{
                int tmpCount=countStack.pop();
                parentheisStack.pop();
                String tmpStr=subStrStack.pop();
                if(parentheisStack.isEmpty()) {
                    for (int i = 0; i < tmpCount; i++) {
                        sb.append(tmpStr);
                    }
                }else{
                    StringBuilder tmpSb=new StringBuilder();
                    tmpSb.append(subStrStack.pop());
                    for (int i = 0; i < tmpCount; i++) {
                        tmpSb.append(tmpStr);
                    }
                    subStrStack.push(tmpSb.toString());

                }
                pos++;

            }
            prePos=pos;
        }


        return sb.toString();
    }

    private void getCount(char[] chars, int from, int to) {
        boolean beforeEnd=false;
        for (int i = from; i < to; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                count = count * 10 + chars[i] - '0';
            } else {
                beforeEnd=true;
                pos = i;
                break;
            }
        }
        if(!beforeEnd){
            pos=to;
        }
    }

    private void getSubStr(char[] chars, int from, int to) {
        boolean beforeEnd=false;
        for (int i = from; i < to; i++) {
            if (!((chars[i] >= 'a' && chars[i] <= 'z')||((chars[i] >= 'A' && chars[i] <= 'Z'))) ){

                beforeEnd=true;
                pos = i;
                break;
            }
        }
        if(!beforeEnd){
            pos=to;
        }
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
