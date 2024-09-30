// 136. Single Number
import java.util.*;

class Leet136 {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int j=1;
        int single=0;
        for(int i=0;i<nums.length-1;i=i+=2){
            if(nums[i]==nums[j]){
                j=j+2;
            }
            else{
                single=nums[i];
                return single;
            }
        }
        return nums[nums.length-1];
    }
}