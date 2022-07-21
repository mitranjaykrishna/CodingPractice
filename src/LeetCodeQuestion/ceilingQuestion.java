package LeetCodeQuestion;

public class ceilingQuestion {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,15));

    }
    static int ceiling(int[] arr, int target)
    {
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        int s=0;
        int e= arr.length-1;
        int m=-1;

        while(s<=e)
        {
            m=s+(e-s)/2;

            if(target<arr[m])
            {
                e=m-1;

            }
            else
                if(target>arr[m])
                {
                    s=s+1;
                }
            else
                return m;
        }
        return s;
    }
}
