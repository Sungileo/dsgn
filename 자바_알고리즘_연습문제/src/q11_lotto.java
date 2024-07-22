package 자바_알고리즘_연습문제.src;

import java.util.Random;

public class q11_lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        
        for (int i = 0; i < 6; i++) {
            int num = rand.nextInt(45);
            System.out.println("행운의숫자" + num);     
        }

    }
}
