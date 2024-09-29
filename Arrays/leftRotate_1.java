// Left Rotate an Array by One

public class leftRotate_1 {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        return arr;

    }
}