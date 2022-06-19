package beak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2;
		ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0;i<num;i++) {
				num2 = sc.nextInt();
		          if(!list.contains(num2))
				list.add(num2);
			}
			
			Collections.sort(list);
			
			
			for(int i = 0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
	}
}
