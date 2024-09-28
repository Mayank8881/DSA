
public class Suduko {

    public static boolean isSafe(int arr[][], int row, int col) {
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == arr[row][col]) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == arr[row][col]) {
                return false;
            }
        }
        int sr = row / 3 * 3;
        int sc = col / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[sr + i][sc + j] == arr[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solveSuduko(int arr[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(arr, i, j)) {
                            arr[i][j] = num;
                            solveSuduko(arr);
                            // arr[i][j] = 0;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = 0;
            }
        }
        solveSuduko(arr);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
