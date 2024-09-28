import java.util.*;
public class Factorial {
    static Stack<Integer> stack=new Stack<>();
    public static void fact(int n,int f){
        if(n==0 || n==1){
            System.out.println("Factorial : "+f);
            return;
        } 
        f=f*n;
        stack.push(f);
        fact(n-1,f);

    }
    public static void main(String[] args) {
        int n = 5;
        fact(n, 1);
        System.out.print("printing stack trace :");
        while(!stack.isEmpty()){
            System.out.print(" => "+stack.pop());
        }
            //System.out.print(stack.pop());

        

    }
}
