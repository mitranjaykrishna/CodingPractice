package LeetCodeQuestion;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] num1={0,0};
        int[] num2={0,1};
        double a=findMedianSortedArrays(num1,num2);
        System.out.println(a);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        double ans;
        merge(nums1,nums2,arr);
        System.out.println(Arrays.toString(arr));

        if(((arr.length)%2)==0)
        {
            int e=arr.length-1;
            int m=e/2;
            return  ((double)arr[m]+arr[m+1])/2;
        }
        else
        {
            int e=arr.length-1;
            ans=(double) e/2;
        }
        return (double)arr[(int)ans];


    }
    public static void merge(int[] nums1,int[] nums2,int[] arr)
    {
        int i=0,j=0,k=0;
        while (i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else if (nums1[i]>nums2[j])
            {
                arr[k]=nums2[j];
                j++;
                k++;
            }
            else{
                arr[k]=nums1[i];
                i++;

                k++;
            }

        }
        if(i<nums1.length)
        {
            while (i<nums1.length)
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
        }
        else
        {
            while (j<nums2.length)
            {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }

    }
}
