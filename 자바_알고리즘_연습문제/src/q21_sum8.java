package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q21_sum8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 >>");
        int num = sc.nextInt();
        int ans = 0;

        for (int i = 1; i < 100000000; i*=10) {
            int z = num/i - (num/i/10) * 10;
            ans+=z;
        }
        System.out.println("합은 %d입니다".formatted(ans));
    }
}
