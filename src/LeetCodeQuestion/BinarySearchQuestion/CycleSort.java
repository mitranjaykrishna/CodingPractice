package LeetCodeQuestion.BinarySearchQuestion;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr={6,3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cycleSort(int [] arr)
    {
        int j=0;

            while(j< arr.length-2)
            {
                if((arr[j]-1)==j)
                    j++;
                else
                {
                    int temp=arr[j];
                    arr[j]=arr[arr[j]-1];
                    arr[temp-1]=temp;
                }

            }

    }
}
