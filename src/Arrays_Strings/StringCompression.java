package Arrays_Strings;

public class StringCompression {

    public static String compressedString(String str){
        if(str.length() <= 1){
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 1);
        char currentChar = str.charAt(0);
        int currentCount =  1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == currentChar){
                currentCount++;
            }else{
                sb.append(currentChar);
                sb.append(currentCount);
                if(sb.length() > str.length()){
                    return str;
                }
                currentChar = str.charAt(i);
                currentCount = 1;
            }
        }
        sb.append(currentChar);
        sb.append(currentCount);
        return sb.toString();
    }

    public static void main(String[] args){
        String test = "aabcccccaaa";
        System.out.println(compressedString(test));
    }
}
