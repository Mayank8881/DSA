
public class Toss {

    public static void printToss(int n, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printToss(n - 1, str + "H");
        printToss(n - 1, str + "T");
    }

    public static void main(String[] args) {
        printToss(3, "");
    }
}
