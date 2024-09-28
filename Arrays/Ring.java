
public class Ring {

    public static void RingPrint(int arr[][]) {
        int n = arr.length;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int temp;

        while (top <= bottom && left <= right) {
            temp = arr[top][left];
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
            System.out.println(temp);
        }

    }

    public static void main(String[] args) {
        int m[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RingPrint(m);
    }
}
