import java.util.Scanner;

public class A35_baekjoon5355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int size = Integer.parseInt(str);
        System.out.println(size);
        for(int i=0; i<size; i++) {
            String s = sc.nextLine();
            String[] a = s.split(" ");
            double num = 0;
            num = Double.parseDouble(a[0]);

            for (int j = 1; j < a.length; j++) {
                if (a[j].equals("@")) num *= 3;
                else if (a[j].equals("%")) num += 5;
                else if (a[j].equals("#")) num -= 7;
            }

            System.out.printf("%.2f", num);
            System.out.println("");
        }
    }
}
