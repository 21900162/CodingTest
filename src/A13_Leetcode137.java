class Solution137 {
    public int singleNumber(int[] nums) {
        int size = nums.length;

        int[] check = new int[size];

        for(int i=0; i<size; i++){
            check[i] = 1;
        }

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(nums[i]==nums[j]){
                    check[i] = check[j] = 0;
                    break;
                }
            }
        }

        for(int i=0; i<size; i++){
            System.out.println(check[i]);
            if(check[i]==1){
                return nums[i];
            }
        }
        return 1;
    }
}