import java.util.Stack;

class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int cout =1;
        int[] new_digit = new int[size+1];
        Stack<Integer> stack = new Stack<>();

        for(int i=size-1; i>=0; i--){
            digits[i] = digits[i] + cout;
            if(digits[i]>=10){
                cout =1;
                digits[i]=0;
            }
            else{
                cout=0;
                break;
            }

            if(i==0 && cout==1){
                new_digit[0] =1;
                for(int j=0; j<size; j++){
                    new_digit[j+1]=digits[j];
                }
                return new_digit;
            }

        }
        return digits;
    }
}