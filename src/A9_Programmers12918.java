class Solution12918 {
    public boolean solution(String s) {
        boolean answer = true;
        int size = s.length();

        if(size==4 || size==6){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                    answer = false;
                    break;
                }
            }
        }
        else{
            answer = false;
        }

        return answer;
    }
}