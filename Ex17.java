package beak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 문제 : https://www.acmicpc.net/problem/1157
public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int countMax = 0;
		String str = sc.next();
		String[] strList = str.split("");
		ArrayList<String> strArrayList = new ArrayList<String>(Arrays.asList(strList));
		
		for(int i = 0; i < strArrayList.size();i++) {
			for(int j = 0; j < strArrayList.size();j++) {
			if(strArrayList.get(i).equals(strArrayList.get(j)))
		}
	}
}
