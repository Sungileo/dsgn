package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q13_astarika_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행개수 >> ");
        int num = sc.nextInt();
        for (int i = 1; i < num+1; i++) {
            System.out.println( "*".repeat(i));
        }
    }
}
