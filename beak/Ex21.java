package beak;

//문제 : https://www.acmicpc.net/problem/2231
import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = "";
		int temp = 0;
		
		for(int i = 1; i<=N;i++) {
			temp = i;
			str = Integer.toString(i);
			String[] strList = str.split("");
			for(String s : strList ) {
				temp += Integer.parseInt(s);
			}
			if(temp==N) {
				System.out.println(i);
				break;
			}
			if(i==N)System.out.println(0);
			temp = 0;
		}
	}
}
