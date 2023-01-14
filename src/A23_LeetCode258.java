class Solution258 {
    public int addDigits(int num) {

        while(num/10>0){
            num = add(num);
        }
        return num;
    }

    public int add(int num){
        int sum =0;
        while(num/10>0){
            sum += num%10;
            num/=10;
        }
        sum+=num;
        return sum;
    }
}