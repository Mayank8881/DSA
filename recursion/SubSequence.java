
public class SubSequence {

    public static void findSub(String str, String ans) {
        // int n = str.length();

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);
        //c1
        findSub(str.substring(1), ans + c);
        //c2
        findSub(str.substring(1), ans);
    }

    public static void main(String[] args) {
        findSub("abc", "");
    }
}
