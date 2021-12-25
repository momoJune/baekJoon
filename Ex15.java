package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int max = 0;
		int num = 0;
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if (max < n[i]) {
				max = n[i];
				num = i + 1;
			}

		}
		System.out.println(max);
		System.out.println(num);

	}
}
