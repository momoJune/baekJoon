package beak;

import java.util.Scanner;

/*	문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 
 * 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 
 * 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int R = sc.nextInt();
					String S = sc.next();
						for (int k = 0; k < S.length(); k++) {
							for(int j = 0;j<R;j++) {
								System.out.print(S.charAt(k));
							}
						}
						System.out.println();
			}
	}
}
