import java.util.Scanner;

public class A19_baekjoon2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] d = new int[10];
        long result = a*b*c;

        String s = Long.toString(result);

        for(int i=0; i<s.length(); i++){
            d[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
        }

        for (int j=0; j<10; j++){
            System.out.println(d[j]);
        }
    }
}
