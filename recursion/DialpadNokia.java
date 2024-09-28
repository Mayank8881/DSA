
public class DialpadNokia {

    public static String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void printDial(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        }
        char c = que.charAt(0);
        int num = c - '0';
        String temp = arr[num];
        for (int i = 0; i < temp.length(); i++) {
            printDial(que.substring(1), ans + temp.charAt(i));
        }
    }

    public static void main(String[] args) {
        String que = "23";
        printDial(que, "");

    }
}
