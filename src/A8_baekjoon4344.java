import java.util.Scanner;

public class A8_baekjoon4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;
        int arrsize=0;
        double sum=0;
        double average=0;
        int count = 0;

        int size = sc.nextInt();
        //System.out.println("size = "+size);

        for(int i=0; i<size; i++){
            arrsize = sc.nextInt();

            arr = new int[arrsize];
            for (int k=0; k<arrsize; k++){
                arr[k] = sc.nextInt();
                sum += arr[k];
            }
            average = sum/ arrsize;//평균 구하기

            for (int m=0; m<arrsize; m++){
                if(arr[m]>average) count ++;
            }
            //System.out.println("i == "+i+"일 때");
            System.out.println(String.format("%.3f",(double)count/arrsize*100) +"%");
            count =0;
            sum =0;

        }

    }
}