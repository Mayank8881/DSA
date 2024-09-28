
import java.util.Stack;

public class elementAtBottom {

    public static void printstack(Stack s, Stack s2) {

        while (!s.isEmpty()) {
            s2.push(s.peek());
            s.pop();
            printstack(s, s2);
        }
        if (s.isEmpty()) {
            s.push(4);
            while (!s2.isEmpty()) {
                s.push(s2.peek());

            }

        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        Stack s = new Stack<>();
        Stack s2 = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        printstack(s, s2);
    }

}
