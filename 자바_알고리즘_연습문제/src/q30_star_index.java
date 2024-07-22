package 자바_알고리즘_연습문제.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q30_star_index {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("%d번째 별의 수 >> ".formatted(i));
            int num = sc.nextInt();
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            int n_star = list.get(i);
            System.out.println(n_star+" "+ "*".repeat(n_star));
        }



    }
}
