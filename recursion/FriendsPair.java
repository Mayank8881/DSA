
public class FriendsPair {

    public static int count = 0;

    public static int findWays(int n) {
        if (n == 0) {
            count++;
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        //single
        int a = findWays(n - 1);
        //pair
        int b = (n - 1) * findWays(n - 2);

        //choice sum
        return a + b;

    }

    public static void main(String[] args) {
        // findWays(4);
        System.out.println(findWays(4));
    }
}
