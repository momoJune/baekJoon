package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//int t = sc.nextInt();
//for(int i =1;i<=t;i++) {
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	if(a>0 && a<10 && b>0 && b<10) {
//		System.out.println("Case #"+i+": "+ a +" + " + b + " = " + (a+b));
//	}
//}

//int t = sc.nextInt();
//for(int i =1;i<=t;i++) {
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	if(a>0 && a<10 && b>0 && b<10) {
//		System.out.println("Case #"+i+": "+ (a+b));
//	}
//}

//if(n<=100000) {
//	for(int i=n;i>=1;i--) {
//		System.out.println(i);
//	}
//}
