import java.util.Scanner;

public class A33_baekjoon2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int max=0;
        int index =0;

        for(int i=0; i<5; i++){
            sum =0;
            for(int j=0; j<4; j++){
                sum+=sc.nextInt();
            }
            if(max<sum){
                max = sum;
                index = i+1;
            }
        }

        System.out.println(index +" "+max);
    }
}
