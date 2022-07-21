package LeetCodeQuestion;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));

    }
    public static int singleNonDuplicate(int[] arr) {
        int s=0;
        int e=arr.length-1;

        if(arr.length==1 || arr[0]!=arr[1])
            return arr[0];
        else if(arr[arr.length-1]!= arr[arr.length-2])
            return arr[arr.length-1];
        else

        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]!=arr[m+1] && arr[m]!=arr[m-1])
                return arr[m];

            if(arr[m]==arr[m+1] && (m%2)==0 || arr[m]==arr[m-1] && m%2==1)
                s=m+1;
            else
                e=m-1;

        }
        return -1;

    }
}
