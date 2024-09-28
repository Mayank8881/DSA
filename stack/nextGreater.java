
import java.util.*;

public class nextGreater {

    public static void printarrrr(int arr[], Stack<Integer> s, int ans[]) {
        for (int i = 4; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() < arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(arr[i]);

        }
        System.out.println(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int ans[] = new int[5];
        Stack<Integer> s = new Stack<>();
        printarrrr(arr, s, ans);
    }
}

// if (s.isEmpty()) {
//     arr[i] = -1;
//     s.push(arr[i]);
// }
// while (!s.isEmpty()) {
//     if (arr[i] < s.peek()) {
//         int temp = arr[i];
//         arr[i] = s.peek();
//         s.push(temp);
//     } else {
//         s.pop();
//     }
// }
// else {
//     if (arr[i] < s.peek()) {
//         int temp = arr[i];
//         arr[i] = s.peek();
//         s.push(temp);
//     } else {
//         s.pop();
//     }
            // }
