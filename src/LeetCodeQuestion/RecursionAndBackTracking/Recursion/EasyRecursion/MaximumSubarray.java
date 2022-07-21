package LeetCodeQuestion.RecursionAndBackTracking.Recursion.EasyRecursion;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }

    public static int maxSubArray(int[] nums) {
        return sum(nums,0,0);

    }

    public  static  int sum(int[] nums,int p,int index)
    {
        if(index>=nums.length)
        {
//            p+=nums[index];
            return p;
        }
        int l=sum(nums,p+nums[index],index+1);
        int r=sum(nums,p,index+1);
        if(l<r)
        {
            return r;
        }
        return l;

    }
}
