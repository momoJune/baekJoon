package beak;

import java.util.ArrayList;
//문제 : https://www.acmicpc.net/problem/7568
import java.util.Scanner;


public class Ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		ArrayList<Integer> countList = new ArrayList<Integer>();
		ArrayList<Integer>[] list = new ArrayList[N];
		for(int i = 0; i<N;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0;i<N;i++) {		//하나씩 저장
			list[i].add(sc.nextInt());
			list[i].add(sc.nextInt());
		}
		
		for(int j = 0;j<N;j++) {
			for(int k = 0;k<N;k++) {
				if(list[j].get(0)<list[k].get(0) && list[j].get(1)<list[k].get(1) ) count++;
			}
			System.out.print(count+1+" ");
			count = 0;
		}
	}
}
