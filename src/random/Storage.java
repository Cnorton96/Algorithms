package random;

import java.util.HashSet;
import java.util.Set;

public class Storage {

    public static void main(String[] args){
        int n = 6, m = 6;
        int[] h = {4};
        int[] v = {2};
        System.out.println(new Storage().findMaxVolume(n, m, h, v));
    }

    private int getMax(int dim, Set<Integer> set){
        int maxHere = 0, maxTotal = 0;
        for(int i = 0 ; i <= dim ; i++){
            maxHere++;
            maxTotal = Math.max(maxTotal, maxHere);
            if(!set.contains(i + 1)) {
                maxHere = 0;
            }
        }
        return maxTotal;
    }
    private int findMaxVolume(int n, int m, int[] h, int[] v){
        Set<Integer> widthSet = new HashSet<>();
        Set<Integer> heightSet = new HashSet<>();
        for(int num : h) heightSet.add(num);
        for(int num : v) widthSet.add(num);

        int maxWidth = getMax(n, heightSet), maxHeight = getMax(m, widthSet);
        return maxHeight * maxWidth;
    }

}
