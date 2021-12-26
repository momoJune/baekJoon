package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[sc.nextInt()];
		int[] score = null;
		int sum = 0;
		double avg = 0;
		int count = 0;
		double per = 0;

		for (int i = 0; i < c.length; i++) {
			int n = sc.nextInt();
			if(!(n>=1 && n<=1000))break; 
			score = new int[n];

			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				if (score[j] >= 0 && score[j] <= 100) sum += score[j];
			}
			avg = (double)(sum)/n;
			
			for(int k = 0; k < n;k++) {
				if(score[k]>avg) {
					count++;
				}
			}
			per = (double)(count)/n*100;
			System.out.printf("%.3f%%\n",per);
			sum =0; count =0;
			
		}
	}
}