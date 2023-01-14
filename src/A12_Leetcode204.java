class Solution204 {
    public int countPrimes(int n) {
        int count =0;


        boolean check[] = new boolean[n+1];

        for(int i=0; i<n; i++){
            check[i] = true;
        }



        for(int i = 2; i*i <n; i++){
            if(check[i]){
                for(int j = i*i; j<n; j+=i)
                    check[j] = false;
            }
        }
        for (int i = 2; i < n; i++) {
            if (check[i])
                count++;
        }
        return count;
    }
}