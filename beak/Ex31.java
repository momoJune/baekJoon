package beak;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        String strNum = sc.next();  //문자열 입력
        String[] strList = strNum.split("");
        List<String> list = new ArrayList<String>(Arrays.asList(strList));

        for(int i = 0;i<list.size();i++){
            num = num + stringToChar(list.get(i));

        }

        System.out.println(num);

    }

        public static int stringToChar(String str){
        int num = 0;
        if(str.equals("A") || str.equals("B") || str.equals("C")) num = 3;
        if(str.equals("D") || str.equals("E") || str.equals("F")) num = 4;
        if(str.equals("G") || str.equals("H") || str.equals("I")) num = 5;
        if(str.equals("J") || str.equals("K") || str.equals("L")) num = 6;
        if(str.equals("M") || str.equals("N") || str.equals("O")) num = 7;
        if(str.equals("P") || str.equals("Q") || str.equals("R") || str.equals("S")) num = 8;
        if(str.equals("T") || str.equals("U") || str.equals("V")) num = 9;
        if(str.equals("W") || str.equals("X") || str.equals("Y") || str.equals("Z")) num = 10;
        return num;
    }
}
