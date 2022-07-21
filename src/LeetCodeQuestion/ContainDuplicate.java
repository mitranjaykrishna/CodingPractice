package LeetCodeQuestion;

import java.util.Arrays;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(containsDuplicate(arr));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int f=0;
        int s=1;

            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[f]!=nums[s])
                {
                    f++;
                    s++;
                }
                else
                    return true;
            }

        return false;

    }

}
