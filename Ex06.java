package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex06 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 1; i <= t; i++) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         if(!(a>0 && a<10 && b>0 && b<10))break;
            System.out.println(a+b);
         }
   }
}