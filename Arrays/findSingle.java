// You are given a sorted array 'arr' of positive integers of size 'n'.
// It contains each number exactly twice except for one number, which occurs exactly once.
// Find the number that occurs exactly once.

public class findSingle {

    public static int getSingleElement(int[] arr) {
        // Write your code here.

        int j = 1;
        int num = 0;
        for (int i = 0; i < arr.length - 1; i = i += 2) {
            if (arr[i] == arr[j]) {
                j = j + 2;
            } else {
                num = arr[i];
                return num;
            }
        }
        return arr[arr.length - 1];

    }
}
