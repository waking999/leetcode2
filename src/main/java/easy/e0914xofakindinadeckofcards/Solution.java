package easy.e0914xofakindinadeckofcards;

import java.util.*;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        int deckLen = deck.length;
        if (deckLen < 2) {
            return false;
        }
        int[] count=new int[10000];
        Arrays.fill(count,0);
        for(int i:deck){
            count[i]++;
        }

        int g=-1;
        for(int c:count){
            if(g==-1){
                g=c;
            }else{
                g=gcd(g,c);
            }
        }
        return g>=2;
    }

    private int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
