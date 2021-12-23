package green.kr.ca.Hello;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[sc.nextInt()];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		System.out.println(n[0]+" "+ n[n.length-1]);
	}
}
