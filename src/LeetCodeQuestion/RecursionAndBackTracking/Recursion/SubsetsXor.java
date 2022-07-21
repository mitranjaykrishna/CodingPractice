package LeetCodeQuestion.RecursionAndBackTracking.Recursion;
//https://leetcode.com/problems/subsets

import java.util.ArrayList;
import java.util.List;

public class SubsetsXor {

    public static void main(String[] args) {

    }
    static  int sum =0;

    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list=new ArrayList<>();
       helper(nums,0,list,new ArrayList<>());
       return list;

    }

    public static void helper(int [] nums,int index,List<List<Integer>> list,List<Integer> list2)
    {
        if(index==nums.length) {
            list.add(new ArrayList<>(list2));
            return;
        }
        list2.add(nums[index]);
        helper(nums,index+1,list,list2);
        list2.remove(list2.size()-1);
        helper(nums,index+1,list,list2);
    }
}
