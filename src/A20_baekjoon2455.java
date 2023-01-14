import java.util.Scanner;

public class A20_baekjoon2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int out =0;
        int in =0;
        int num =0;
        int max =0;

        for(int i=0; i<4; i++){
            out = sc.nextInt();
            in = sc.nextInt();

            num+=in-out;
            if(max<num) max = num;
        }
        System.out.println(max);
    }
}
