import java.util.Scanner;

public class A29_baekjoon17210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        int num =0;
        int num2 =0;

        if(i>=6){
            System.out.println("Love is open door");
            return;
        }
        else{
            num=sc.nextInt();
            if(num == 0) num2 =1;
            else if(num ==1) num2 =0;

            for (int j=1; j<i; j++){
                if(j%2==0)
                    System.out.println(num);
                else {
                    System.out.println(num2);
                }
            }
        }

    }
}
