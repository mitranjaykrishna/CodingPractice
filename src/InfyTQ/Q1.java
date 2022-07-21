package InfyTQ;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int k;
            if(in.hasNextInt())
            {
                k=in.nextInt();
                list.add(k);
            }
        }

        //call
        int storeS;
        int storeM;

        for(int i=0;i<n;i++)
        {
            storeS=checkSum(list.get(i));
            storeM=checkMul(list.get(i));
            if(storeM>=storeS)
            {
                System.out.println(num(list.get(i)));
            }
//            System.out.println();1
        }
    }

    public static int checkSum(int a)
    {
        int sum=0;
        int l=(int)Math.floor(Math.log10(a) + 1);
        for(int i=0;i<l;i++)
        {
            int t=a%10;
            sum+=t;
            a=a/10;
        }
        return sum;

    }
    public static int checkMul(int a)
    {
        int mul=1;
        int l=(int)Math.floor(Math.log10(a) + 1);
        for(int i=0;i<l;i++)
        {
            int t=a%10;

            mul*=t;
            a=a/10;
        }
        return mul;

    }

    public static int num(int a)
    {
        int s=0;
        int l=(int)Math.floor(Math.log10(a) + 1);
        for(int i=0;i<l;i++)
        {
//             int t=a%10;

//             mul*=t;
//             a=a/10;
            if(a==0)
                break;
            s=s*10+a;
            a=a-1;
        }
        a=s;
        for(int i=0;i<l;i++)
        {
            int t=a%10;

//             mul*=t;
//             a=a/10;
            if(a==0)
                break;

            s=s*10+t;
            a=a/10;
        }
        return s;

    }
}
