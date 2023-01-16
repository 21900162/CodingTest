import java.util.Scanner;

public class A31_baekjoon2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;

        sum +=n-1;
        sum += n*(m-1);

        System.out.println(sum);
    }
}
