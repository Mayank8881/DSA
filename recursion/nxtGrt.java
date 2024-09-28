
import java.util.Arrays;

public class nxtGrt {

    public static void findEle(int arr[], int i, int j) {
        if (arr[j] > arr[i]) {
            arr[i] = arr[j];
        } else {
            arr[i] = -1;
        }
        if (j == arr.length - 1) {
            arr[j] = -1;
            System.out.println(Arrays.toString(arr));
            return;
        }
        findEle(arr, i + 1, j + 1);
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        findEle(arr, 0, 1);
    }
}
