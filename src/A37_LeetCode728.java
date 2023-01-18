import java.util.ArrayList;
import java.util.List;

class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<Integer>();
        int num =0;
        boolean check = true;

        for(int i=left; i<=right; i++){
            num = i;
            check =true;
            while(num>0){
                System.out.println(i);
                System.out.println(num);
                System.out.println("");

                if((num%10==0) || (i%(num%10)!=0)) {
                    check = false;
                    break;
                }
                num/=10;
            }
            if(check) output.add(i);
        }

        return output;
    }
}