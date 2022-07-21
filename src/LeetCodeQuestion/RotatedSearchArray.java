package LeetCodeQuestion;

public class RotatedSearchArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,4));

    }
    static int search(int[] nums, int target) {
        int pivot=findPivot(nums);

        //pivot not found
        if(pivot==-1)
        {
           return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot found
        else if(target==nums[pivot])
        {
            return pivot;
        }
        else if (target>=nums[0])
        {
            return binarySearch(nums,target,0,pivot-1);
        }
        else
        {
            return binarySearch(nums,target,pivot+1, nums.length-1);
        }

    }

    static int binarySearch(int [] arr,int target,int s,int e)
    {
        while (s<=e)
        {
            int m=s+(e-s)/2;

            if(arr[m]<target)
            {
                s=m+1;
            }
            else if(arr[m]>target)
            {
                e=m-1;
            }
            else
                return m;
        }
        return -1;
    }



    static int findPivot(int[] arr)
    {
        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1])
            {
                return m;
            }
            else if(m>s && arr[m]<arr[m-1])
            {
                return m-1;
            }
            else if (arr[s]>=arr[m])
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return -1;
    }


}
