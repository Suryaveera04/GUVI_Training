import java.io.*;
import java.util.*;
class parantesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for( int i = 0; i< s.length(); i++ ) {
            char c = s.charAt(i);
            if ( c == '(' || c == '{' || c == '[' ){
                st.push(c);
            }
            else {
                if ( st.isEmpty() || 
                    ( c == ')' && st.peek() != '(' ) ||
                    ( c == '}' && st.peek() != '{' ) ||
                    ( c == ']' && st.peek() != '[' ) )
                    return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    
    public static void main(String[] args) {
        parantesis p = new parantesis();
        System.out.println(p.isValid("()"));
        System.out.println(p.isValid("()[]{}"));
        System.out.println(p.isValid("(]"));
    }
}