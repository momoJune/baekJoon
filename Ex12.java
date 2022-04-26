package beak;

// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
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
