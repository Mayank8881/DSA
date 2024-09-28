import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //Upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
           System.out.println();
        }

        //lower half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=2*(i-1);k++){
                System.out.print("   ");
            }
            for(int l=1;l<=n-i+1;l++){
                System.out.print(" * ");
            }
           System.out.println();
        }
    }
}
