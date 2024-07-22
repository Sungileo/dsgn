package 자바_알고리즘_연습문제.src;

public class q4_sum100 {
    public static void main(String[] args) {
        
        int num = 1;
        int ans = 0;
        while (num <=100) {
            if (num%2==0) {
                ans -= num;
                System.out.print("- " + num + " ");
            }else{
                ans += num;
                System.out.print("+ " + num + " ");
            }
            num++;

        }
        System.out.println("결과: " + ans);
    }
}
