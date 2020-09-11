package LinkedList_Maps;
/* Given n nuts and n bolts, consider a one to one mapping between them. Write a snippet of code that finds all matches
   between the nuts and bolts with the minimum number of iterations.
 */

import java.util.Arrays;
import java.util.HashMap;

public class NutsAndBolts {

    public static void match(char[] nuts, char[] bolts){
        //In this map each nut is a key and it's position is the value.
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<nuts.length; i++){
            //storing the current nut in the map with it's location as the value.
            map.put(nuts[i], i);
        }

        for(int i=0; i<bolts.length; i++){
             char bolt = bolts[i];
             if(map.containsKey(bolt)){
                 nuts[i] = bolts[i];
             }else{
                 System.out.println("Bolt " + bolt + "has no nut.");
             }
        }

        System.out.println("Matches between nuts and bolts:");
        System.out.println("Nuts " + Arrays.toString(nuts));
        System.out.println("Bolts " + Arrays.toString(bolts));


    }

    public static void main(String[] args){
        char[] nuts = {'$', '%', '&', 'x', '@'};
        char[] bolts = {'%', '@', 'x', '$', '&'};
        match(nuts,bolts);

    }
}
