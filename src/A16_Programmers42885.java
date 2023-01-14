import java.util.Arrays;

class Solution42885 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int size = people.length;
        int min = people[0];
        int index = 0;

        System.out.println(min);
        for(int i= size-1; i>=index; i--){
            if(people[i]+min>limit){
                answer++;
            }
            else{
                answer++;
                index++;
                min = people[index];
            }
        }
        return answer;
    }
}