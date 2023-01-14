class Solution342 {
    public boolean isPowerOfFour(int n) {

        if(n<=0) return false;
        else if(n==1) return true;

        while(n>0){
            if(n%4 != 0) return false;
            n/=4;
            if(n==1) break;
        }

        return true;
    }
}