import java.util.*;
public class swapElement {
    public static void main(String[] args) {
        int[] arr={1,5,9,3};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
