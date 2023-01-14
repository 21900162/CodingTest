import java.util.Scanner;

public class A17_baekjoon1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int size =  input.length();
        int[] count = new int[10];
        int max=0;

        for(int i=0; i<size; i++){
            count[Integer.parseInt(String.valueOf(input.charAt(i)))]++;
        }
        max = count[0];

        count[6] += count[9];
        count[9] =0;

        if(count[6]%2==1){
            count[6] = count[6]/2 + 1;
        }
        else count[6] = count[6]/2;

        for(int i=1; i<10; i++){
            if(max<count[i]) max = count[i];
        }
        System.out.println(max);
    }


}
