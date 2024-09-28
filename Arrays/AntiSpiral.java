
public class AntiSpiral {

    public static void Anti(int arr[][]) {
        int n = arr.length;
        int top = 0, left = 0, right = n - 1, bottom = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
            for (int i = left; i <= right; i++) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][right]);

            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(arr[top][i]);
            }
            top++;
        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Anti(arr);
    }
}
