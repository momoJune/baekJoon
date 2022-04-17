package beak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


/*	
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 */

public class Ex10 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			//문장을 공백도 함께 받으므로 nextLine 을 이용
			String str = in.nextLine();
			in.close();
			
			//StringTokenizer는 문자열 자르는데 간편
			StringTokenizer strs = new StringTokenizer(str," ");
			
			System.out.println(strs.countTokens());
			
	}
}