import java.util.Arrays;

class Solution60057 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];

        double[] temp = new double[N];
        double[] temp_sort = new double[N];
        int[] check = new int[N];
        int index =0;
        double sum = 0;

        double all = stages.length;
        double count =0;


        for(int i=1; i<=N; i++){
            for(int j=0; j<stages.length; j++){
                if(stages[j] <= i) count++;
            }
            if(all == 0) temp[i-1] =0;
            else temp[i-1] = (count-sum)/all;

            System.out.println("all = " + all);
            System.out.println("count = " + (count-sum));
            System.out.println("");

            temp_sort[i-1] = temp[i-1];
            all = all - (count-sum);
            sum=count;
            count = 0;
        }

        Arrays.sort(temp_sort);// 내림차순

        for(int u =0; u<temp_sort.length; u++){
            System.out.println(temp_sort[u]);
        }


        for(int i=N-1; i>=0; i--){
            for(int j =0; j<N; j++){
                if((temp_sort[i]==temp[j]) && (check[j] != 1)){
                    check[j] =1;
                    answer[index++] = j+1;
                }
            }
        }

        return answer;
    }
}