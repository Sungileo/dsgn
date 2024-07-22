package 자바_알고리즘_연습문제.src;


public class q43_Collatze {
    public static void main(String[] args) {
        int num = 9;
        int cnt = 0;
        while (num!=1) {
            if (num%2==0) {
                num = num/2;
            }else{
                num = num*3+1;
            }            
            cnt+=1;

            if (cnt == 500) {
                break;
            }
        }
        if (cnt==500) {
            System.out.println(-1);
        }else{
            System.out.println(cnt);
        }
    }
}
