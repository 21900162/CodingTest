import java.util.ArrayList;
import java.util.Arrays;

class Solution12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count =0;
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                count ++;
                ar.add(arr[i]);
            }
        }
        System.out.println("count = "+ count);
        System.out.println("que size = "+ ar.size());

        if(count ==0){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[count];
            for(int j=0; j<ar.size(); j++){
                answer[j]=ar.get(j);
            }
        }
        Arrays.sort(answer);


        return answer;
    }
}