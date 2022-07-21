package LeetCodeQuestion;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int [] arr={1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }

    public static int[] findErrorNums(int[] nums) {
        int j=0;
        while(j<nums.length)
        {
            int correct=nums[j]-1;
            if(nums[j]!=nums[correct])
            {
                int temp=nums[j];
                nums[j]=nums[correct];
                nums[correct]=temp;
            }
            else
                j++;
        }
        for(int i=0;i<nums.length;i++)
        {
//            if(nums[0]!=1)
//                return new int[]{i+1,nums[i+1]};

            if(nums[i]!=i+1)
            {
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};

    }
}
