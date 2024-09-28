import java.util.*;
public class SubString {
    public static void findSub(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                    sum+=arr[k];
                }
                System.out.println(" => sum : "+sum);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        findSub(arr);
        System.out.println(Arrays.toString(arr));
    }
}
