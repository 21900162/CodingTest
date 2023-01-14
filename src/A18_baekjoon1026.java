import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A18_baekjoon1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a= new int[size];
        Integer[] b = new Integer[size];
        int sum=0;

        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());
        //b의 크기에 맞게 a를 정렬해야하는 문제
        for(int i=0; i<size; i++){
            sum+=a[i]*b[i];
        }

        System.out.println(sum);
    }
}

