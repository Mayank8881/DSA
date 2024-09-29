// You are given a sorted integer array 'arr' of size 'n'.
// You need to remove the duplicates from the array such that each element appears only once.
// Return the length of this new array.

public class removeDuplicate_1 {
    public static int removeDuplicates(int[] arr,int n) {
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        return count;
    }
}