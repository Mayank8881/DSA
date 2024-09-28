public class PalindromicPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){

            //left
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+(i-k+1)+" ");
            }

            //right
            for(int l=2;l<=i;l++){
                System.out.print(" "+l+" ");
            }
            System.out.println();
        }
    }
}
