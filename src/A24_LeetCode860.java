class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        int rest =0;

        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five<=0) return false;
                five--;
                ten++;
            }
            else{
                if(five>=1 && ten>=1){ten -= 1; five -=1;}
                else if(five>=3 && ten>=0){five-=3;}
                else {return false;}
            }
        }
        return true;
    }
}