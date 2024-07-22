package 자바_알고리즘_연습문제.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class q28_random_list_minmax {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int rand1 = rand.nextInt(100);
            list.add(rand1);
        }

        System.out.println();

    }
}
