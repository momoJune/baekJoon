package green.kr.ca.Hello;
import java.util.Scanner;

public class Ex11 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int x = sc.nextInt();
	      for (int i = 1; i <= n; i++) {
	         int a = sc.nextInt();
	         if(a>=1 && a<=10000) {
	            if(a<x)System.out.print(a +" ");
	         }
	      }
	}
}
