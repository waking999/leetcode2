package easy.e0242validanagram;

public class Solution {
    public boolean isAnagram(String s, String t) {

        if(s==null&&t==null) return true;
        if((s==null&&t!=null)||(s!=null&&t==null)) return false;
        int sLen=s.length();
        int tLen=t.length();
        if(sLen!=tLen) return false;

        if(s.equals(t)) return true;

        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();

        int[] count=new int[128];
        for(char sCh:sArray){
            count[sCh]++;
        }

        for(char tCh:tArray){
            if(count[tCh]==0){
                return false;
            }
            count[tCh]--;
        }


        return true;
    }
}
