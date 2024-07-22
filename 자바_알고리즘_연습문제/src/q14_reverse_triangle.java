package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q14_reverse_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("행 개수 >> ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
