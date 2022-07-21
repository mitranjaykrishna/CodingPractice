package LeetCodeQuestion;

import java.util.Arrays;

public class Shivam {
    public static void main(String[] args) {
        int[] [] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,16)));


    }
    public static int[] binary(int [][] arr,int row,int s,int e,int target)
    {
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[row][m]==target)
                return new int[]{row,m};
            if(arr[row][m]<target)
                s=m+1;
            else
                e=m-1;
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][] arr, int target)
    {
        int s=0;
        int e=arr.length-1;
        if(arr[e][0]==target || arr[e][0]<target)
//            return new int []{e,0};
            return binary(arr,e,0, arr[0].length-1,target );
        if(arr[0][0]>target)
            return new int[]{-1,-1};

        while(s< (e-1))
        {
            int mid=s+(e-s)/2;


            if(arr[mid][0]==target)
//                return mid;
                return new int[]{mid,0};
            if(arr[mid][0]<target)
                s=mid;
            else
                e=mid-1;

        }

//        return s;
        return binary(arr,s,0,arr[0].length-1,target);
    }

//    public static int search(int[] arr, int target)
//    {
//        int s=0;
//        int e=arr.length-1;
//        if(arr[e]==target || arr[e]<target)
//            return e;
//        if(arr[0]>target)
//            return -1;
//
//        while(s< (e-1))
//        {
//            int mid=s+(e-s)/2;
//
//
//            if(arr[mid]==target)
//                return mid;
//            if(arr[mid]<target)
//                s=mid;
//            else
//                e=mid-1;
//
//        }
//
//        return s;
//    }
}
