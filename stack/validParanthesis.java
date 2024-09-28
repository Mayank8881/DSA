
import java.util.*;

public class validParanthesis {

    public static boolean valid(String str, Stack<Character> s) {
        for (int i = 0; i < str.length(); i++) {
            if (s.isEmpty()) {
                return false;
            }
            switch (str.charAt(i)) {

                case '{':
                case '(':
                case '[':
                    s.push(str.charAt(i));
                    break;
                case '}':
                    if (s.peek() == '{') {
                        s.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (s.peek() == '[') {
                        s.pop();
                    } else {
                        return false;
                    }
                    break;
                case ')':
                    if (s.peek() == '(') {
                        s.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }

        }

        return s.isEmpty();

    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "([)]";

        System.out.println(valid(str, s));
    }
}
