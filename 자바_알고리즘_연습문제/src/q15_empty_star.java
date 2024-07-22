package 자바_알고리즘_연습문제.src;

public class q15_empty_star {
    public static void main(String[] args) {
        
        for (int i = 1; i < 6; i++) {
            System.out.println(" ".repeat(6-i) + "*".repeat(i));
        }
    }
}
