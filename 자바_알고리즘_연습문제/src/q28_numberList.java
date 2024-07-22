package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q28_numberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n 입력 >>");
        int num = sc.nextInt();

        int ans = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(ans+i);
            ans+=i;
        }
    }
}
