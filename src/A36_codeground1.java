import java.util.Scanner;

class Solution1 {
    static int Answer;

    public static void main(String args[]) throws Exception	{

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {
            int n = sc.nextInt();
            Answer =0;
            for(int i =0; i<n; i++){
                Answer ^= sc.nextInt();
            }

            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
}