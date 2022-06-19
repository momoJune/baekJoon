package beak;
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
//단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] char_str = str.toCharArray();
		int a = 0;
		
		char chr = 'a';
		for(int i = 1;i<=26;i++) {
			for(int j=0;j<str.length();j++) {
				if(chr==char_str[j]) {
					a = j;
					break;
				}else a = -1;
			}
			System.out.print(a+" ");
			chr++;
		}
	}
}
 