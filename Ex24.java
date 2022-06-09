package beak;

import java.util.ArrayList;
import java.util.Collections;
//문제 : https://www.acmicpc.net/problem/1436
import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int A = sc.nextInt();
		String str = Integer.toString(A);
		String[] str1 = str.split("");
		for (int i = 0; i < str.length(); i++) {
			list.add(str1[i]);
		}

		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < str.length(); i++) {
			System.out.print(list.get(i));
		}
	}
}
