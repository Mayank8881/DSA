// 283. Move Zeroes

public class Leet283 {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }

        }
        for (int k = j; k < n; k++) {
            nums[k] = 0;
        }
    }

// **Solution 2: Using Two Pointers**
    public void moveZeroes_2(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }
        int temp = 0;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
}
