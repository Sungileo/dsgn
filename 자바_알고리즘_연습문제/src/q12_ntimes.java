package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q12_ntimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수입력 >>");
        int num = sc.nextInt();
        System.out.print("어느 수까지 출력 >>");
        int num2 = sc.nextInt();

        System.out.println(num+"단");
        for (int i = 1; i < num2+1; i++) {
            System.out.println("%d * %d = %d".formatted(num,i,num*i));
        }

    }
}
