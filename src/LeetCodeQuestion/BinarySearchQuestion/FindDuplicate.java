package LeetCodeQuestion.BinarySearchQuestion;
//https://leetcode.com/problems/find-the-duplicate-number/
//amazon, microsoft

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,3,3,2,5};
        System.out.println(findDuplicate(arr));

    }

    public static int findDuplicate(int[] nums) {
        int j=0;
        while(j<nums.length)
        {
            if(nums[j]!=j+1)
            {
                int correct=nums[j]-1;
                if(nums[j]!=nums[correct])
                {
                    int temp=nums[j];
                    nums[j]=nums[correct];
                    nums[correct]=temp;
                }
                else
                    return nums[j];
            }
            else
                j++;
//            int correct=nums[j]-1;
//            if(nums[j]<=nums.length && nums[j]!=nums[correct])
//            {
//                int temp=nums[j];
//                nums[j]=nums[correct];
//                nums[correct]=temp;
//            }
//            else
//                j++;
        }
        //Duplicate find

//        for(int i=0;i<nums.length;i++)
//        {
//            if(nums[i]!=i+1)
//                return nums[i];
//        }
        return -1;

    }
}
