import java.util.Scanner;

public class A32_baekjoon2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i=0; i<num; i++){
            int floor = sc.nextInt()+1;
            int ho = sc.nextInt();

            int [][] arr = new int[floor][ho];

            for(int k=0; k<floor; k++){
                for(int j=0; j<ho; j++){
                    if(k==0){
                        arr[0][j] = j+1;
                    }
                    else if(j==0){
                        arr[k][0]=1;
                    }
                    else{
                        arr[k][j] = arr[k][j-1]+arr[k-1][j];
                    }
                }
            }

            System.out.println(arr[floor-1][ho-1]);

        }
    }

}
