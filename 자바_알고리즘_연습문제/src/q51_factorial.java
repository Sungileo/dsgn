package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q51_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 >> ");
        int num = sc.nextInt();
        int ans = 1;
         
        while (num>0) {
            ans *= num;
            num--;
        }
        System.out.println("출력 >>"+ans);

    }
}
