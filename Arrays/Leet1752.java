// 1752. Check if Array Is Sorted and Rotated
public class Leet1752 {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(count==1 && nums[nums.length-1]>nums[0]){
            count++;
        }       
        if(count>1){
            return false;
        }
        else{
            return true;
        }
    }
}