
public class ReverseString {
    public static void StringReverse(String s){
        String[] word = s.split("");
        String result = " ";
        for ( int i = word.length; i > 0 ; i--) {
            result += word[i-1];
            
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String word = "Strings are immutable";
        StringReverse(word);
    }
}