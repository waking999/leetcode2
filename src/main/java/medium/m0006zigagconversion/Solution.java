package medium.m0006zigagconversion;



public class Solution {


    public String convert(String s, int n) {
        if(n==1){
            return s;
        }
        int sLen = s.length();

        char[]  array = new char[sLen] ;


        /*
        i: the index of new string
         */
        int i=0;

        /*
        p: the pointer for the string
         */
        int p = 0;
        /*
        r: the row index for the new string
         */
        int r=0;
        /*
        gap means the next position of the string for the element of each row for the new string
        the gap pattern:
        row 0 and n-1, gap is 2*(n-1), for example,n=4
        row 0: we retrieve 0,6,12,18,...
        row 3: we retrieve 3,9,15,21,...
        the middle rows: will be 2 gaps: 2*(n-1)-2*r and 2*r
        row 1: we retrieve 1,5,7,11,13,17,19,...
        row 2: we retrieve 2,4,8,10,14,16,20,...
         */
        int gap=2*(n-1);

        //1st row
        r=0;
        i=r;
        p=r;
        while(p<sLen){
            array[i]=s.charAt(p);
            p+=gap;
            i++;
        }

        //middle rows
        r=1;
        while(r<n-1){
            int g1=gap-2*r;
            int g2=2*r;
            boolean useG1=true;

            p=r;
            while(p<sLen){
                array[i]=s.charAt(p);

                if(useG1){
                    p+=g1;
                }else{
                    p+=g2;
                }
                useG1=!useG1;
                i++;
            }



            r++;
        }

        //last row
        r=n-1;
        p=r;
        while(p<sLen){
            array[i]=s.charAt(p);
            p+=gap;
            i++;
        }



        return new String(array);
    }
}
