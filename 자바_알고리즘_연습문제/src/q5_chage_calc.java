package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q5_chage_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("총금액 입력 >>");
        int num = sc.nextInt();

        int man = num/10000;
        int och = num%10000/5000;
        int chn = num%10000%5000/1000;
        int obk = num%10000%5000%1000/500;
        int bak = num%10000%5000%1000%500/100;

        System.out.println("만원 : %d개".formatted(man));
        System.out.println("오천원 : %d개".formatted(och));
        System.out.println("천원 : %d개".formatted(chn));
        System.out.println("오백원 : %d개".formatted(obk));
        System.out.println("백원 : %d개".formatted(bak));



    }
}
