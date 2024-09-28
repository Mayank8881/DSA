
import java.util.Stack;

public class Histogram {

    public static void maxAreaRectangle(int arr[]) {
        int size = arr.length;
        int sl[] = new int[size];
        int sr[] = new int[size];

        nextSmallerLeft(arr, sl);
        nextSmallerRight(arr, sr);

        int max = 0;
        //area=height*(right-left-1)
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static void nextSmallerRight(int arr[], int ans[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i >= arr.length - 1; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = s.peek();
            }
            s.push(arr[i]);

        }
    }

    public static void nextSmallerLeft(int arr[], int ans[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i >= arr.length - 1; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(arr[i]);

        }
    }

    public static void main(String[] args) {

    }
}
