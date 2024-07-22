package 자바_알고리즘_연습문제.src;

public class q16_sandtimer {
    public static void main(String[] args) {

        for (int i = 65; i < 82; i++) {

            System.out.print((char)i);

            if ((i-65 == 4) || (i-65 == 8)) {
                System.out.println();
                System.out.print(" ");                
            }
            if ((i-65 == 7)) {
                System.out.println();
                System.out.print("  ");                
            }
            if ((i-65 == 11)) {
                System.out.println();                
            }

        }
    }
}
