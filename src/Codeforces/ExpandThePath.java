package Codeforces;

import java.util.*;

public class ExpandThePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] s=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {


            s[i]=sc.nextLine();
//            sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            if (s[i].indexOf('r') < s[i].indexOf('R') && s[i].indexOf('g') < s[i].indexOf('G') && s[i].indexOf('b') < s[i].indexOf('B'))
                System.out.println("Yes");
            else
                System.out.println("NO");

        }
    }


}
