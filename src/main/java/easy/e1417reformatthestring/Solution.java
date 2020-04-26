package easy.e1417reformatthestring;

public class Solution {
	public String reformat(String s) {
		if(s==null||s.isBlank()) {
			return "";
		}
		char[] chars=s.toCharArray();
		int len=chars.length;
		char[] digits=new char[len];
		int digitPos=0;
		char[] letters=new char[len];
		int letterPos=0;
		
		for(char c:chars) {
			if(c>='a'&&c<='z') {
				letters[letterPos++]=c;
			}else {
				digits[digitPos++]=c;
			}
		}
		if(Math.abs(digitPos-letterPos)>1) {
			return "";
		}
		if(digitPos>=letterPos) {
			char[] retChars=new char[len];
			for(int i=0;i<digitPos;i++) {
				retChars[i*2]=digits[i];
			}
			for(int i=0;i<letterPos;i++) {
				retChars[i*2+1]=letters[i];
			}
			return new String(retChars);
			
		}else   {
			char[] retChars=new char[len];
			
			for(int i=0;i<letterPos;i++) {
				retChars[i*2]=letters[i];
			}
			for(int j=0;j<digitPos;j++) {
				retChars[j*2+1]=digits[j];
			}
			return new String(retChars);
		}
		
       
    }
}
