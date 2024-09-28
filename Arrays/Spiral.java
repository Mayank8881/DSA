
public class Spiral {

    public static void SpriralPrint(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        while (top < bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(arr[i][right]);
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.println(arr[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.println(arr[i][left]);
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int m[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        SpriralPrint(m);
    }
}
