package 자바_알고리즘_연습문제.src;

public class q9_colsums {
    public static void main(String[] args) {
        int num1 = 77;
        int num2 = 1;
        int ans = 0;
        while (num2<=78) {
            ans += num1 * num2;
            num1--;
            num2++;
        }
        
        System.out.println(ans);


    }
}
