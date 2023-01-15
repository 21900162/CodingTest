import java.util.Scanner;

public class A30_baekjoon17211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int feel = sc.nextInt();
        double good =1;//기분 좋을 확률
        double bad =1;
        double temp =0;

        double hh = sc.nextDouble();
        double hs = sc.nextDouble();
        double sh = sc.nextDouble();
        double ss = sc.nextDouble();

        if(feel == 0){
            good = hh;
            bad = hs;
        }
        else if(feel == 1){
            good = sh;
            bad = ss;
        }

        for(int i=1; i<day; i++){

            temp = good;
            good = good*hh + bad*sh;
            bad = temp*hs + bad*ss;

        }

        System.out.println(Math.round(good*1000));
        System.out.println(Math.round(bad*1000));
    }
}


