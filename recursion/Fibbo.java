
public class Fibbo {

    public static int fibboo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibboo(n - 1) + fibboo(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibboo(n));
    }
}
