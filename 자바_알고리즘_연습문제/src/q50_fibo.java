package 자바_알고리즘_연습문제.src;

public class q50_fibo {
    public static void main(String[] args) {
        int input = 15;

        int num = 1;
        int num2 = 1;
        int temp = 0;

        for (int i = 0; i < input; i++) {
            if (i<=1) {
                System.out.print(1 + " ");
            }else{
                temp = num2;    
                num2 = num;
                num = num+temp;
                System.out.print(num + " ");
            }
        }

    }
}
