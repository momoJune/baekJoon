
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int finalNum = 0;

        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        StringBuffer strB1 = new StringBuffer(str1);
        str1 = strB1.reverse().toString();
        StringBuffer strB2 = new StringBuffer(str2);
        str2 = strB2.reverse().toString();

        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);

        if(num1 > num2) {
            finalNum = num1;
            System.out.println(num1);
        }else System.out.println(num2);

    }
}
