
import java.util.*;

public class reverseString {

    public static void reverse(String ss, Stack s, String str) {
        for (int i = 0; i < ss.length(); i++) {
            s.push(ss.charAt(i));
        }
        while (!s.isEmpty()) {
            str = str + s.peek();
            s.pop();
        }
        if (s.isEmpty()) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String ss = "abdul";

        System.out.println(ss);
        reverse(ss, s, "");
    }
}
