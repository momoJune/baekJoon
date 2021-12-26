package green.kr.ca.Hello;

import java.util.Scanner;


public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int subCount = sc.nextInt();
		int[] subj = new int[subCount];
		int m = 0;
		double avg = 0;
		double sum = 0;
		
		for(int i = 0; i<subj.length;i++) {
			subj[i] = sc.nextInt();
			if(subj[i]<=100 && subj[i]>=0) {
				if(m<subj[i]) m = subj[i];
			}
		}
		for(int j =0;j<subj.length;j++) {
			sum += (double)(subj[j])/m*100;
			avg = (double)(sum)/subCount;
		}
		System.out.println(avg);
	}
}
