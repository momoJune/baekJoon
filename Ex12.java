package green.kr.ca.Hello;
import java.util.Scanner;

public class Ex12 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();

	      do {
	         System.out.println(a+b);
	         a = sc.nextInt();
	         b = sc.nextInt();
	         
	         
	      }while(a>0 && b>0 && a<10 && b<10);
	   }
	}
}
