package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q3_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 >>");
        int num = sc.nextInt();

        if (num%10 < 5) {
            num = num/10*10;
        }else{
            num = num/10*10+10;
        }
        System.out.println(num);


    }
}
