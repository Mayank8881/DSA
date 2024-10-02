// 34. Find First and Last Position of Element in Sorted Array

class Leet34 {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int start=-1;
        int end=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                end=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                start=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        int arr[]=new int[2];
        arr[0]=start;
        arr[1]=end;
        return arr;
    }
}