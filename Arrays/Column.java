
public class Column {

    public static void columnPrint(int arr[][]) {
        int n = arr.length;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = top; i <= bottom; i++) {
                System.out.println(arr[i][left]);
            }
            left++;

        }
    }

    public static void main(String[] args) {
        int m[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        columnPrint(m);
    }
}
