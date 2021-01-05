package Arrays_Strings;

public class isUnique {
    //Implement an algorithm to determine if a string has all unique characters.
    //What if you can't use additional data structures?

    public static boolean isStringUnique(String str){
        if(str.length() > 128){
            return false;
        }

        boolean[] charArr = new boolean[128];
        for(int i=0; i<str.length(); i++){
            int val = str.charAt(i);
            if (charArr[val]) {
                return false;
            }
            charArr[val] = true;
        }
        return true;

    }

    public static void main(String[] args){
        String test1 = "Hello";
        String test2 = "Work";
        String test3 = "mom";
        String test4 = "name";
        System.out.println(isStringUnique(test1));
        System.out.println(isStringUnique(test2));
        System.out.println(isStringUnique(test3));
        System.out.println(isStringUnique(test4));
    }
}
