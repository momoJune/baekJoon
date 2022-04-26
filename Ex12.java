package beak;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int N = sc.nextInt();
		if (N >= 0) {
			for (int i = 1; i <= N; i++) {
				a *= i;
			}
		}
		System.out.println(a);
	}
}
