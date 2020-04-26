package easy.e1422maximumscoreaftersplittingastring;

class Solution {
    public int maxScore(String s) {
    	char[] chars=s.toCharArray();
    	int len=chars.length;
    	
    	int[] scoreLR=new int[len];
    	int[] scoreRL=new int[len];
    	
    	if(chars[0]=='0') {
    		scoreLR[0]=1;
    	}
    	if(chars[len-1]=='1') {
    		scoreRL[len-1]=1;
    	}
    	
    	
    	for(int l=1;l<len-1;l++) {
    		int r=len-1-l;
    		if(chars[l]=='0') {
    			scoreLR[l]=scoreLR[l-1]+1;
    		}else {
    			scoreLR[l]=scoreLR[l-1];
    		}
    		if(chars[r]=='1') {
    			scoreRL[r]=scoreRL[r+1]+1;
    		}else {
    			scoreRL[r]=scoreRL[r+1];
    		}
    	}
//    	if(chars[len-1]=='0') {
//    		scoreLR[len-1]=scoreLR[len-2]+1;
//    	}else {
//    		scoreLR[len-1]=scoreLR[len-2];
//    	}
//    	if(chars[0]=='1') {
//    		scoreRL[0]=scoreRL[1]+1;
//    	}else {
//    		scoreRL[0]=scoreRL[1];
//    	}
    	
    	int maxRtn=Math.max(scoreLR[0]+scoreRL[0], scoreLR[len-1]+scoreRL[len-1]);
    	for(int i=1;i<len-1;i++) {
    		maxRtn=Math.max(scoreLR[i]+ scoreRL[i],maxRtn);
    	}
    	
    	
        return maxRtn;
    }
}
