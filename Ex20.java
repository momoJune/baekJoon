package beak;

//문제 : https://www.acmicpc.net/problem/2798
import java.util.ArrayList;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int num = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> numList = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}
		for (int k = 0; k < N - 2; k++) {
			for (int i = k+1; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {

					if(numList.get(k)+numList.get(i)+numList.get(j)<=num && 
					   numList.get(k)+numList.get(i)+numList.get(j)>sum)
					sum = numList.get(k) + numList.get(i) + numList.get(j);
				}
			}
		}
		System.out.println(sum);
	}
}
