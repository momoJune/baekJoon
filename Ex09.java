package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 100000) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
	}
}