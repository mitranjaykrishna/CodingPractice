package LeetCodeQuestion;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/#

public class PositionOfAnElementInInfiniteArr {
    public static void main(String[] args) {
        int [] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        System.out.println(ans(arr,7));

    }

    static int ans(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while (arr[end]<target)
        {
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int [] arr,int target,int s,int e)
    {
        while (s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]<target)
            {
                s=mid+1;
            }
            else
                if (arr[mid]>target)
                {
                    e=mid-1;
                }
            else
                return mid;
        }
        return -1;
    }
}
