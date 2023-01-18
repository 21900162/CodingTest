class Solution367 {
    public boolean isPerfectSquare(int num) {
        int end = num/2;
        int start = 1;
        int mid =0;
        if(num==1) return true;

        while(start<=end){
            mid = (end+start)/2;
            if(Math.pow(mid,2)>num) end = mid -1;
            else{
                start = mid + 1;
            }
        }
        if(Math.pow(end,2) == num) return true;
        else return false;
    }

}