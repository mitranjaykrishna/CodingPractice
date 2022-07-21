package Math.Bitwise;

import java.util.Arrays;

public class UniqueBetweenThreeRepetion {
    public static void main(String[] args) {
        int [] arr={2,2,3,2,7,7,8,7,8,8};
        int n=9,ans=0;
        int[] b=new int[10];
        for(int i=0;i<10;i++)
        {
            binary(arr[i], b);
        }
        for(int i=0;i<10;i++)
        {
            b[i]=b[i]%3;
        }
        for(int i=0;i<=9;i++)
        {
            ans+=(int)(b[i]*(Math.pow(2,n)));
            n--;
        }

        System.out.println(Arrays.toString(b));
        System.out.println(ans);


    }
    public static void binary(int a,int[] arr)
    {
        for(int i=9;0<=i;i--)
        {
            arr[i]+=a%2;
            a=a>>1;
        }
    }




}
