package 자바_알고리즘_연습문제.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q10_3times {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            System.out.print(i+"번째 정수 입력 >>");
            int num = sc.nextInt();
            if (num%3 == 0) {
                list.addLast(num);
            }
        }

        System.out.print("3의 배수 : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }

    }
}
