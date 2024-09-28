
public class Power {

    public static int poww(int n, int m) {

        if (m == 0) {
            return 1;
        }
        if (m % 2 == 0) {
            return (poww(n, m / 2) * poww(n, m / 2));
        } else {
            return (n * poww(n, m / 2) * poww(n, m / 2));
        }
        // poww(n, m - 1);
    }

    public static void main(String[] args) {
        System.out.println(poww(2, 5));
    }
}
