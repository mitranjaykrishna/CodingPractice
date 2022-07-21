package Codechef;
//https://www.codechef.com/submit/FLOW006

import java.util.Scanner;

public class FLOW006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr[i]=sum(arr[i]);
        }
        for(int element :arr)
        {
            System.out.println(element);
        }



    }

    public static int sum(int arr)
    {
        int sum=0;
        while(arr!=0)
        {
            int temp=arr%10;
            sum+=temp;
            arr=arr/10;


        }
        return sum;

    }
}
