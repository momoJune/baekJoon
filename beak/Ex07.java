package beak;

import java.util.Scanner;

public class Ex07 {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      if(n>=1 && n<=10000) {
         for(int i=1;i<=n;i++) {
            sum += i;
         }
         System.out.println(sum);
      }
   }
}