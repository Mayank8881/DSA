class Leet153 {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int small=Integer.MAX_VALUE;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[left]<=nums[mid]){
                small=Math.min(small,nums[left]);
                left=mid+1;
            }
            else{
                small=Math.min(small,nums[mid]);
                right=mid-1;
            }
            // final=Math.min(final, small);
        }
        return small;
    }
}