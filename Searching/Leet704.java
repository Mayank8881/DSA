// 704. 

class Leet704 {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

// for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 return i;
//             }
//         }
//         return -1;
