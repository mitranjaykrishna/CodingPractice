package LeetCodeQuestion.BinarySearchQuestion;
//https://leetcode.com/problems/find-in-mountain-array/

public class FoundInMountainArrayUssingFunc {
    public static void main(String[] args) {

        int[] arr={0,2,3,4,5,3,1,0};
        int target=0;
        int ans=-1;
        int peak=peekFind(arr);
        System.out.println("peak = "+peak);
        if(arr[peak]==target)
        {
            ans=peak;
        }
        else
        {
            ans=binarySearchAsc(arr,target,0,peak-1);
            if(ans==-1)
                ans=binarySearchDsc(arr,target,peak+1, arr.length-1);


        }
        System.out.println("target value at index "+ans);




    }


    static int binarySearchAsc(int[] arr,int target,int s,int e)
    {
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]<target)
            {
                s=m+1;
            }
            else
                if(arr[m]>target)
                {
                    e=m-1;
                }
            else
                return m;
        }
        return -1;
    }



    static int binarySearchDsc(int[] arr,int target,int s,int e)
    {
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]<target)
            {
                e=m-1;
            }
            else
            if(arr[m]>target)
            {
                s=m+1;
            }
            else
                return m;
        }
        return -1;
    }





    static int peekFind(int [] arr) {
        int s = 0;
        int e = arr.length - 1;


        while (s < e) {
            int m = s + (e - s) / 2;

            if (arr[m] < arr[m + 1]) {
                s = m + 1;
            } else if (arr[m] > arr[m + 1])
                e = m;
        }

        return e;
    }
}
