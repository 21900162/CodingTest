import java.util.Scanner;

public class A7_baekjoon2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean check = true;

        int[] input = new int[8];
        for(int i=0; i<8; i++){
            input[i] = sc.nextInt();
        }

        if(input[0] == 1){
            for(int i=0; i<7; i++){
                if(input[i]+1 != input[i+1])
                    check = false;
            }
            if(!check) System.out.println("mixed");
            else System.out.println("ascending");
        }
        else if(input[0] == 8){
            for(int i=0; i<7; i++){
                if(input[i]-1 != input[i+1])
                    check = false;
            }
            if(!check) System.out.println("mixed");
            else System.out.println("descending");
        }
        else System.out.println("mixed");
    }

}