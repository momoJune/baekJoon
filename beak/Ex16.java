package beak;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count=0;
		int chrr =0;
		String str = a*b*c+"";
		
		for(int i = 0; i < 10; i++) {
			for(int j =0; j< str.length();j++) {
				char chr = str.charAt(j);
				chrr = chr - '0';
				if(i==chrr) count++;
			}
			System.out.println(count);
			count =0;
		}
				
	}
}
