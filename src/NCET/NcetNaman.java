package NCET;
import java.util.*;

public class NcetNaman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int [] arr=new int[t];
        int count=0;
        for (int i=0;i<t;i++)
        {
            arr[i]= sc.nextInt();
        }
        int[] ans=new int[t];
        if(arr[0]>arr[1])
        {
            ans[0]=1;
        }
        else
        {
            count++;
            ans[0]=count;
        }
        for(int i=1;i<t;i++)
        {
            if(arr[i]<arr[i-1])
            {
                count=1;

                ans[i]=count;

            }
            else if(arr[i]>arr[i-1])
            {
                count++;
                ans[i]=count;

            }
        }
        System.out.println(Arrays.toString(ans));

    }
}