package Arrays_Strings;

public class PalindromePermutation {
    /* Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
       that is the same backwards and forwards. A permutation is a rearrangement of letters.
     */

    public static boolean isPermutation(String str){
        int odd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c : str.toCharArray()){
            int x = getCharNumber(c);
            if( x != -1){
                if(table[x] % 2 == 1){
                    odd++;
                }else{
                    odd--;
                }
            }
        }
        return odd <= 1;

    }

    public static int getCharNumber(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }



    public static void main(String[] args){
        String str = "racecar";
        System.out.println("Is the word racecar a palindrome of a permutation: " + isPermutation(str));

    }
}
