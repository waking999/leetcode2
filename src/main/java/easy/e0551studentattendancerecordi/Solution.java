package easy.e0551studentattendancerecordi;

public class Solution {
    public boolean checkRecord(String s) {
        if(s==null) {
            return true;
        }
        int sLen=s.length();
        if(sLen==0) {
            return true;
        }
        if((s.contains("LLL"))){
            return false;
        }
        int aPos=s.indexOf("A");
        if(aPos!=-1){
            int bPos=s.indexOf("A",aPos+1);
            return bPos == -1;
        }




        return true;
    }
}
