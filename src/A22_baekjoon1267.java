import java.util.Scanner;

public class A22_baekjoon1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = 0;
        int y =0;
        int m =0;

        for(int i=0; i<size; i++){
            num = sc.nextInt();
            if(num<30)
                y += 10;
            else{
                y += (num/30+1)*10 ;
            }

            if(num<60)
                m += 15;
            else{
                m += (num/60+1)*15 ;
            }
        }
        if(m==y) System.out.println("Y M "+y);
        else if(m>y) System.out.println("Y "+y);
        else System.out.println("M "+m);


    }
}
