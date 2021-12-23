package green.kr.ca.Hello;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m;
		int a = n;							// while 조건문 비교용
		int count = 0;
		String str = "";
		
		if(n>=0 && n<=99) {   				// 입력값범위
			do {
			m = n; 							
			n = (n/10)+(n%10); 				// n의 십의자리 + 일의자리
			if(n<10) str = (m%10+(n+""));   // n이 한자리수면 
			str =(m%10+(n%10+""));  		// n이 두자리수면
			n = Integer.parseInt(str);		// 형변환
			count++;						// while문 반복시 센다
			}while(n!=a);						
			System.out.println(count);
		}
	}
}
