package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q2_sigeup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("일한 시간을 입력하세요 >> ");
        int hour = sc.nextInt();
        int money = 0;

        if (hour > 8) {
            money = 40000 + (hour - 8)*7500; 
        } else{
            money = hour * 5000;
        }
        System.out.print("총 임금은 %d원 입니다.".formatted(money));
        

    }
}
