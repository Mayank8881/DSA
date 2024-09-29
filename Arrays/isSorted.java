public class isSorted {
    public static int isArraySorted(int n, int []a) {
        // Write your code here.
        int flag=0;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1]){
                flag=0;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}