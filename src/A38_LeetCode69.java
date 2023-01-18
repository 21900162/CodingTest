class Solution69 {
    public int mySqrt(int x) {
        int num =1;
        if(x==0) return 0;

        while(true){
            if((x>=Math.pow(num, 2)) && (x<Math.pow(num+1, 2))) break;
            num++;
        }
        int a = 2147395600;
        return num;
    }
}