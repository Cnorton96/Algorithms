package Arrays_Strings;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    private HashMap<Character, Character> mappings;

    public ValidParenthesis(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            // If the current character is a closing bracket.
            // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
            if(this.mappings.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();
                if(topElement != this.mappings.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args){

    }
}
