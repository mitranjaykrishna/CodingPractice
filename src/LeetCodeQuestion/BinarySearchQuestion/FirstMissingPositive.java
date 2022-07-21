package LeetCodeQuestion.BinarySearchQuestion;
//https://leetcode.com/problems/first-missing-positive/
//Amazon

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr={1};
        System.out.println(firstMissingPositive(arr));

    }
    public static int firstMissingPositive(int[] nums) {
        int j=0;
        while(j<nums.length)
        {
            int correct=nums[j]-1;
            if(nums[j]>0 && nums[j]<=nums.length && nums[j]!=nums[correct])
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
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;

    }
}
