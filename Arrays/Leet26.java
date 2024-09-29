// 26. Remove Duplicates from Sorted Array

public class Leet26 {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                count++;
                nums[j]=nums[i+1];
                j++;
            }
        }

        return count;
    }
}