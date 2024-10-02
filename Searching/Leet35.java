// 35. Search Insert Position

class Leet35 {
    public int searchInsert(int[] nums, int target) {
        int ans=nums.length;
        int right=nums.length-1;
        int left=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>=target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}