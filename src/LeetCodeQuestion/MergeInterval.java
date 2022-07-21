package LeetCodeQuestion;
//https://leetcode.com/problems/merge-intervals/

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [] [] ans=merge(intervals);
        System.out.println(Arrays.deepToString(ans));


    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int []> list=new ArrayList<>();
        //initialise start and end
        int start=intervals[0][0];
        int end=intervals[0][1];
        int i=1;
        while(i<intervals.length)
        {
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s<=end)
                end=Math.max(end,e);
            else
            {
                list.add(new int[]{start, end});
                start=s;
                end=e;
            }
            i++;
        }
        list.add(new int[]{start,end});
        return  list.toArray(new int[0][]);



    }
}
