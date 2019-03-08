package easy.e0459repeatedsubstringpattern;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s==null){
            return false;
        }
        int sLen=s.length();
        if(sLen<2){
            return false;
        }

        char lastChar=s.charAt(sLen-1);
        int end=s.indexOf(lastChar);
        while(end<sLen-1){

            if(sLen%(end+1)==0){
                int groupCount=sLen/(end+1);
                boolean found=true;
                String pattern=s.substring(0,end+1);
                for(int i=1;i<groupCount;i++){
                    String tmp=s.substring((end+1)*i,(end+1)*(i+1));
                    if(!tmp.equals(pattern)){
                        found=false;
                        break;
                    }
                }
                if(found){
                    return true;
                }else{
                    end=s.indexOf(lastChar,end+1);
                }

            }else{
                end=s.indexOf(lastChar,end+1);
            }

        }


        return false;
    }


}
