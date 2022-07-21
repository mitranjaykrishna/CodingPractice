package GoogleKickStart;

import java.util.*;

public class Pr1 {
    public static void main (String[] agr)
    {
        Scanner sc=new Scanner(System.in);
        int t,b,c,sum=0;
        t=sc.nextInt();
        int[]  arr;
        List <Integer> list=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            b=sc.nextInt();
            c=sc.nextInt();
            arr=new int[b];
            for(int j=0;j<b;j++)
            {
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            list.add(sum%c);

        }

        for(int i=0;i<t;i++)
        {
            System.out.println(list.get(i));
        }

    }
}
