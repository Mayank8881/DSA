// 1752. Check if Array Is Sorted and Rotated
public class Leet1752 {
    public static boolean check(int[] nums) {
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
    public static void main(String[] args) {
        int arr[]={6,7,2,3,4,5};
        System.out.println(check(arr));
    }
}
