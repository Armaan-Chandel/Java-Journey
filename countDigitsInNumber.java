import java.util.*;
public class Main{
    public static int countDigit(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int count=countDigit(n);
        System.out.print("The number of digits in the nuumber is : "+count);
    }
}
