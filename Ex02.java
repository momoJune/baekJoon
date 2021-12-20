package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b/10%10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}
//System.out.println((a+b)%c);
//System.out.println(((a%c) + (b%c))%c);
//System.out.println((a*b)%c);
//System.out.println(((a%c) * (b%c))%c);


//System.out.println(a+b);
//System.out.println(a-b);
//System.out.println(a*b);
//System.out.println(a/b);
//System.out.println(a%b);

//Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
//if(a>0 && b>0 && a<10 && b<10)System.out.println(a/(double)(b));

//Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
//if(a>0 && b>0 && a<10 && b<10)System.out.println(a+b);

//System.out.println("|\\_/|");
//System.out.println("|q p|   /}");
//System.out.println("( 0 )\"\"\"\\");
//System.out.println("|\"^\"`    |");
//System.out.println("||_/=\\\\__|");