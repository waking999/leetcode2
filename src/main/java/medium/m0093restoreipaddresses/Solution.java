package medium.m0093restoreipaddresses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> rtn = new ArrayList<>();

        int sLen = s.length();
        if(sLen<4){
            return rtn;
        }




        StringBuilder sb=new StringBuilder();
        dfs(s,0,sb,rtn,0);


        return rtn;
    }

    private void dfs(String str, int subDomainStartPos, StringBuilder sb,  List<String> rtn,int subDomainCount) {
        if(subDomainCount>=4){
            return;
        }
        for (int l = 1; l <= 3; l++) {
            if (subDomainStartPos + l > str.length()) {
                continue;
            }
            String ip =  str.substring(subDomainStartPos, subDomainStartPos + l);
            if(ip.length()>1&&ip.startsWith("0")){
                continue;
            }
            int sbLen=sb.length();
            if (subDomainStartPos + l == str.length() &&  Integer.parseInt(ip)<256 && subDomainCount==3) {

                sb.append(ip);
                rtn.add(sb.toString());
                return;
            }
            if(Integer.parseInt(ip)<256 ){
                sb.append(ip).append(".");
                dfs(str,subDomainStartPos+l,sb,rtn,subDomainCount+1);
                sb.setLength(sbLen);
            }
        }

    }
}
