package beak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int NN = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<N;i++){
             list.add(NN= sc.nextInt());
        }
        Collections.sort(list);

        for(int i =0;i<N;i++) {
            System.out.println(list.get(i));
        }
    }
}
