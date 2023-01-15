import java.util.Arrays;

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        int count_g = g.length;
        int count_s = s.length;
        int output =0;
        Arrays.sort(g);
        Arrays.sort(s);

        for(int i=0; i<count_s; i++){

            for(int j=0; j<count_g; j++){
                if((s[i]>=g[j]) && (g[j]!=0) ){
                    System.out.println(i+"번째 s는 "+ s[i] + " g는 "+g[j] +"로 같음");
                    g[j]=0;
                    output++;
                    break;
                }
            }

        }
        return output;
    }
}