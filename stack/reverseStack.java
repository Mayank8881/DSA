
import java.util.*;

public class reverseStack {

    public static void pushAtBottom(Stack<Integer> s, int a) {
        if (s.isEmpty()) {
            s.push(a);
            return;
        }
        int ele = s.pop();
        pushAtBottom(s, a);
        s.push(ele);

    }

    public static void reverseS(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int a = s.pop();
        reverseS(s);
        pushAtBottom(s, a);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        System.out.println(s);
        reverseS(s);
        System.out.println(s);

    }
}
