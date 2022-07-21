import java.util.ArrayList;
import java.util.List;

public class ShivamHWInfytq {
    public static void main(String[] args) {
        int n=512;
        solve(n);
    }

    public static void solve(int n)
    {

        int l = (int) (Math.log10(n) + 1);
        if(checkNine(n))
        {
            int d1=0;
            int d2=0;
            for(int i=0;i<l;i++)
            {
                d1=(d1*10)+1;
                d2=(d2*10)+9;

            }
        }
        else
        {
            //min
            String s=String.valueOf(n);
            char d1=s.charAt(0);
            char d2=1;
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                System.out.println(c);
                if (c == d1) {
                    s = s.substring(0, i) + d2 + s.substring(i + 1);
                }
            }
            System.out.println(s);

        }
    }


    public static boolean checkNine(int n) {
        int l = (int) (Math.log10(n) + 1);
        for (int i = 0; i < l; i++) {
            int t = n % 10;
            if (t != 9)
                return false;
            n = n / 10;
        }
        return true;
    }


}
