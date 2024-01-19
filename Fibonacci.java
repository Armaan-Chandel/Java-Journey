import java.util.*;
public class Main{
    public static void printFibonacci(int n){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.print(0);
            return;
        }
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        printFibonacci(n);
        
    }
}
