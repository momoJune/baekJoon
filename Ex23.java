package beak;

import java.util.ArrayList;
//문제 : https://www.acmicpc.net/problem/1436
import java.util.Scanner;


public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		ArrayList<String> list = new ArrayList<String>();
		
		while(true) {
			String str = Integer.toString(num);
			if(str.contains("666")) list.add(str);
			num++;
			if(list.size()==N)break;
		}
		System.out.println(list.get(N-1));
		
	}
}
