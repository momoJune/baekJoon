package beak;

import java.util.Scanner;

public class Ex05 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n>=1 && n<=9) {
         for(int i=1;i<=9;i++) {
            System.out.println(n+" * "+i + " = " + n*i);
         }
      }
   }
}