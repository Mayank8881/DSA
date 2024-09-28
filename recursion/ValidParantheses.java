
public class ValidParantheses {

    public static void paraPrint(int open, int close, String str) {
        System.out.println(open + " " + close);
        if (open == 0 && close == 0) {
            System.out.println(str);
            return;
        }
        if (open < 0 || close < 0) {
            return;
        }
        // if (open > close) {
        //     return;
        // }
        paraPrint(open - 1, close, str + "(");
        paraPrint(open, close - 1, str + ")");

    }

    public static void main(String[] args) {
        String str = "";
        paraPrint(2, 2, str);
        System.out.println(str);
    }
}
