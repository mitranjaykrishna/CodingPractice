package LeetCodeQuestion.Assesment;

import java.util.Locale;

public class Assesment04022022 {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",2));

    }
    public static String licenseKeyFormatting(String s, int k) {
        s=s.replace("-","");
        s=s.toUpperCase();
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length();
        int count =1;
        if(n%k==0)
        {
            for(int i=0;i<n;i++)
            {
                if(count ==k)
                {
                    sb.insert(k,'-');
                    count=0;

                }
                else
                count++;
            }

        }
        else
        {
            int m=n%k;
            for(int i=0;i<m;i++)
            {
                if(count ==m)
                {
                    sb.insert(k+1,'-');

                }
                count++;
            }

        }







        return  sb.toString();
    }
}
