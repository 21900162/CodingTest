import java.util.Scanner;

public class A21_baekjoon2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum =0;

        for(int i=0; i<size; i++){
            if(i==size-1) sum += sc.nextInt();
            else sum+=sc.nextInt()-1;
        }

        System.out.println(sum);
    }
}
