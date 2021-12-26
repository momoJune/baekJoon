package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		int namu;

		for (int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
			namu = n[i] % 42;
			System.out.println(namu);
		}
	}
}
