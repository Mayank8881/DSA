// 268. Missing Number

class Leet268 {

    public int missingNumber(int[] nums) {
        int sum = 0;
        int N = nums.length + 1;
        int sum_n = (N * (N - 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum_n - sum;
    }
}
