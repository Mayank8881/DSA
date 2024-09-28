import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr={7,2,9,4,1};
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        // int a=10;
        // System.out.printf("preety printing %d\n",a);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int arr[], int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
