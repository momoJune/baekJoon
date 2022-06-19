package beak;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int sec = 60;
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			if(m<60 && m>=45) {
				m *= sec;
				m -= 2700;
				m /= 60;
				System.out.println(h +" "+ m);
			}else{
				m *= sec;
				m += 3600;
				m -= 2700;
				m /= 60;
				if(h==0) h=24;
				System.out.println(h-1 +" "+ m);
			}
		}
	}
}

/*
	10 시 10분  10 시 600초
	3600
	
	9 시 1500초

4200 - 2700 = 1500



23시 40 분   23시 2400초

22시 

6000 -  2700 = 3300


10시 00분 10시 0초

3600 - 2700 = 9시 900초

20시 55분  20시 3300초

3300 - 2700 = 20 시 600초



8시 45분 8시 2700초

2700 - 2700 =  8시 0초


10시 59분     10시 3540초

3540 - 2700 = 840

0시 55분   0시 3300

3300 - 2700 0시 600;

*/