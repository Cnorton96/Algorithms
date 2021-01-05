package Arrays_Strings;

public class checkPermutation {
    //Given two strings, write a method to decide if one is a permutation of the other.

    public static String sort(String a){
        char[] charArr = a.toCharArray();
        java.util.Arrays.sort(charArr);
        return new String(charArr);
    }

    public static boolean isPermutation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        return sort(a).equals(sort(b));

    }


    public static void main(String[] args){
        String test1 = "god";
        String test2 = "dog";
        String test3 = "fog";
        System.out.println(isPermutation(test1,test2));
        System.out.println(isPermutation(test1,test3));
    }
}
