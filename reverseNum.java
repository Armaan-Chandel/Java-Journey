import java.util.*;
public class Main{
    public static int reverseNum(int n){
        int a=0;
        while(n!=0){
            int r=n%10;
            n=n/10;
            a=(a*10)+r;   
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int a=reverseNum(n);
        System.out.print(a);  
    }
}
