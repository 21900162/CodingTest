class Solution12947 {
    public boolean solution(int x) {
        boolean answer = true;
        int input = x;
        int sum =0;

        while(x>0){
            sum += x%10;
            x/=10;
        }

        if(input%sum!=0) answer = false;

        return answer;
    }
}