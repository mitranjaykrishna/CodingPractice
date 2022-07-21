package LeetCodeQuestion;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
        System.out.println(01);


    }

    public static int[] twoSum(int[] arr,int target)
    {
        int[] index= {-1,-1};
        int sum=0;
        for(int i=0;i<= arr.length-1;i++)
        {

            for(int j=i+1;j<= arr.length-1;j++)
            {
                sum=arr[i]+arr[j];

                if(sum==target)
                {
                    index[0]=i;
                    index[1]=j;
                    return index;
                }


            }
        }

    return index;
    }

}

