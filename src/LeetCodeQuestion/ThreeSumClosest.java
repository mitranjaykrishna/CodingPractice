package LeetCodeQuestion;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int [] nums={-1,2,1,-4};
        int target= 1;
        System.out.println(threeSumClosest(nums,target));

    }

    public static int threeSumClosest(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        return find(nums, target, 0, list);
    }

    public static int find(int [] nums, int target, int index, List<Integer> list)
    {

        if(index==nums.length-1 )
        {
            int sum=0;
            if(list.size()==3) {
                for (int i = 0; i < 3; i++) {
                    sum += list.get(i);
                }
                if (sum == target) {
                    return 1;
                }
            }
            return 0;
        }

        list.add(nums[index]);
        int f=find(nums,target,index+1,list);

        list.remove(index);
        int s=find(nums,target,index+1,list);
        return f+s;

    }
}
