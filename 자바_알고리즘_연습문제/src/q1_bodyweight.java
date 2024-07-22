package 자바_알고리즘_연습문제.src;

import java.util.Scanner;

public class q1_bodyweight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("현재몸무게 >> ");
        int weight = sc.nextInt();
        System.out.print("목표몸무게 >> ");
        int target = sc.nextInt();
        
        int weeks = 1;
        while (weight >= target) {
            System.out.print(weeks  + "주차 감량 몸무게 :  ");
            weeks+=1;
            int  loss= sc.nextInt();
            weight -= loss;
        }
        System.out.println(target+"kg 달성!! 축하합니다!");


    }
}
