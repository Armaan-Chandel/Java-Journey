//5=n
//
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num=1;
       for(int i=0;i<=n;i++){
           for(int j=0;j!=i;j++){
               System.out.print(num+" ");
               num++;
           }
           System.out.println("");
       }      
    }
}
/////////////////////////////////////////////////////////////
// 5=n
//
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num=1;
       for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
             if((i+j)%2==0){
                 System.out.print(1);
             }
             else{
                 System.out.print(0);          
             }
         }
         System.out.println("");    
       }    
    }
}
/////////////////////////////////////////////////////////
// 4

// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *
import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           int spaces=(2*n)-(2*i);
           for(int j=1;j<=spaces;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
       for(int i=n;i>=1;i--){
           for(int j=i;j>=1;j--){
               System.out.print("*");
           }
           int space=(2*n)-(2*i);
           for(int j=space;j>=1;j--){
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--){
               System.out.print("*");
           }
           System.out.println("");
       }    
    }
}
///////////////////////////////////////////////////////
// 5

//     *****
//    *****
//   *****
//  *****
// *****
import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=n;j++){
               System.out.print("*");
           }
           System.out.println("");
       }   
    }
}
////////////////////////////////////////////////////////////////
// 5

//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=(n-i);j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print(i+" ");
           }    
           System.out.println("");
       }     
    }
}
///////////////////////////////////////////////////////////
// 5

//     1
//    212
//   32123
//  4321234
// 543212345
import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--){
               System.out.print(j);
           }
           for(int j=2;j<=i;j++){
               System.out.print(j);
           }
           System.out.println("");
       }
    }
}
