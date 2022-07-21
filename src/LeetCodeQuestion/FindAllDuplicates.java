package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));

    }

    public static List<Integer> findDuplicates(int[] nums) {
        int j=0;
        List<Integer> list=new ArrayList<>();
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
                {

                    j++;
                }
            }
            else
                j++;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
                list.add(nums[i]);
        }
        return list;

    }
}
