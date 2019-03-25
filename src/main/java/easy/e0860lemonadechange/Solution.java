package easy.e0860lemonadechange;

public class Solution {
    public boolean lemonadeChange(int[] bills) {

        int count5=0;
        int count10=0;

        for(int b:bills){
            if(b==5){
                count5++;
            }else if(b==10){
                if(count5==0){
                    return false;
                }else{
                    count5--;
                    count10++;
                }
            }else if(b==20){
                if(count5==0){
                    return false;
                }
                if(count10>0){
                    count10--;
                    count5--;
                }else{
                    if(count5<3){
                        return false;
                    }else{
                        count5-=3;
                    }
                }
            }
        }

        return true;
    }
}
