package LeetCodeQuestion;
//https://leetcode.com/problems/missing-number/
//Amazon
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1};
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] arr)
    {
        int j=0;

        while(j<arr.length)
        {
            int correct=arr[j];
            if(arr[j]<arr.length && arr[j]!=arr[correct])
            {
                int temp=arr[j];
                arr[j]=arr[correct];
                arr[correct]=temp;
            }
            else
                j++;
        }

        //search for missing value
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
                return i;
        }
        // case 2
        return arr.length;
    }
}
