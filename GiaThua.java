package giathua;

import java.util.Scanner;

public class GiaThua {

   public static long giaiThua(int n)
   {
       if(n==0 || n==1)
           return 1;
       else
           return n*giaiThua(n-2);
   }
   
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("nhap n: ");
        int n= sc.nextInt();
        System.out.println("giai thua la: " + giaiThua(n));
    }
    
}

