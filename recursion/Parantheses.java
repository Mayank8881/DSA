
public class Parantheses {

    public static void paraPrint(int open, int close, String str) {
        if (open == 0 && close == 0) {
            System.out.println(str);
            return;
        }
        if (open < 0 || close < 0) {
            return;
        }
        // System.out.println(open + " " + close);
        paraPrint(open - 1, close, str + "(");
        paraPrint(open, close - 1, str + ")");

    }

    public static void main(String[] args) {
        String str = "";
        paraPrint(1, 1, str);
        System.out.println(str);
    }
}
