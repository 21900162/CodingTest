import java.util.Scanner;
import java.util.Stack;

public class A28_baekjoon10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cout = 0;
        int sum = 0;
        int f =0;
        int s =0;
        Stack<Integer> stack = new Stack<>();

        String a = sc.next();
        String b = sc.next();

        int size = a.length()>b.length()? a.length(): b.length();

        for(int i=0; i<size; i++){
            if(a.length()-i-1>=0)
                f = Integer.parseInt(String.valueOf(a.charAt(a.length() - i-1)));
            else f=0;

            if(b.length()-i-1>=0)
                s = Integer.parseInt(String.valueOf(b.charAt(b.length() - i -1)));
            else s =0;

            sum = cout;
            sum += (f+s);

            if(sum>=10) {cout = 1; sum -=10;}
            else cout =0;

            stack.push(sum);
        }

        if(cout==1) stack.push(1);
        for(int i=stack.size()-1; i>=0; i--){
            System.out.print(stack.elementAt(i));
        }
    }
}
