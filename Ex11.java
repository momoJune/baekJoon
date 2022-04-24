package beak;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt(); // 1000
		long b = sc.nextInt(); // 70
		long c = sc.nextInt(); // 170
		long count = 1;
		if(b>=c) {
			count=-1;
			System.out.println(count);
		}

		if (c - b > 0) { // 순이익이 0이상
			if (a % (c - b) > 0) { // 고정비를 순이익으로 나눈 나머지가 없으면 한대만 더팔면 되므로
				count = (a / (c - b))+1;
			} else if (a % (c - b) == 0) { // 고정비를 순이익으로 나눈 나머지가 0이상이면 그 몫이 답.
				count = a / (c - b) + 1;
			}
			System.out.println(count);
		}
	}
}
