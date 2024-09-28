
public class StairCase {

    public static void findCase(int n, String ans, int dice) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if (n < 0) {
            return;
        }
        // findCase(n - 1, ans + "1");
        // findCase(n - 2, ans + "2");
        for (int i = 1; i <= dice; i++) {
            findCase(n - i, ans + i, dice);
        }
        // findCase(n - dice, ans + dice, dice);
    }

    public static void main(String[] args) {
        findCase(4, "", 5);
    }
}
