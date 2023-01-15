class Solution42883 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int size = number.length();
        int temp =0;

        for(int i=0; i<size-k;i++){
            char max = '0';
            for(int j=temp; j<=i+k; j++){
                if(number.charAt(j)>max){
                    max = number.charAt(j);
                    temp =j+1;
                }
            }
            answer.append(max);

        }
        return answer.toString();
    }
}