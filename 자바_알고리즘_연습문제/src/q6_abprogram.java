package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q6_abprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numa = 1;
        int numb = 1;

        while (true) {
            System.out.print("A입력 >>");
            numa = sc.nextInt();
            System.out.print("B입력 >>");
            numb = sc.nextInt();
            if ((numa!=0) && (numb!=0)) {
                System.out.println("결과 >>" + (numa-numb));
            }else{
                break;
            }
        }
    }
}
