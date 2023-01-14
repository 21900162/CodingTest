import java.util.ArrayList;
import java.util.List;

class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        int size = nums.length;
        int start =0;
        int finish =0;
        boolean check = true;
        List<String> list = new ArrayList<String>();

        if(size==0) return list;

        for(int i =0; i<size-1; i++){
            if(nums[i]+1 == nums[i+1]){
                if(check){
                    start = i;
                    check = false;
                }

            }
            else{
                check =true;
                finish = i;
                if(nums[start]!=nums[finish])
                    list.add(nums[start] + "->" + nums[finish]);
                else list.add(String.valueOf(nums[start]));
                start = finish +1;
            }
        }

        if(nums[start]!=nums[size-1])
            list.add(nums[start] + "->" + nums[size-1]);
        else list.add(String.valueOf(nums[start]));

        return list;
    }
}