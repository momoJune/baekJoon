package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x>=-1000 && x<=1000 && x!=0) {
			int y = sc.nextInt();
				if(y>=-1000 && y<=1000 && x!=0) {
					if(x>0 && y>0)System.out.println(1);
					if(x<0 && y>0)System.out.println(2);
					if(x<0 && y<0)System.out.println(3);
					if(x>0 && y<0)System.out.println(4);
				}
		}
	}
}
//int score = sc.nextInt();
//
//if(score>=0 && score<=100) {
//	if(score>=90)System.out.println("A");
//	else if(score>=80)System.out.println("B");
//	else if(score>=70)System.out.println("C");
//	else if(score>=60)System.out.println("D");
//	else if(score<60)System.out.printf("F");

//if(a>b)System.out.println(">");
//if(a<b)System.out.println("<");
//if(a==b)System.out.println("==");