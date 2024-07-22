package 자바_알고리즘_연습문제.src;

import java.util.Random;
import java.util.Scanner;

public class q8_random_sum {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            int rand1 = rand.nextInt(100);
            int rand2 = rand.nextInt(100);
            System.out.print("%d + %d = ".formatted(rand1,rand2));
            int ans = sc.nextInt();
            
            if (rand1+rand2 == ans) {
                System.out.println("Success!!");
                break;
            }else{
                System.out.println("Fail...");
                System.out.println("계속할까용~");
                String yn = sc.next();
                if (yn.equals("N")) {
                    break;
                }
                if ((i==4)) {
                    System.out.println("GAME OVER ~~");
                }
            }
        }
    }
}
