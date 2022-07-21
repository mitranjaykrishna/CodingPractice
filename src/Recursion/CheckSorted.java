package Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr={1,2,2,6,8};
        int x=arr.length,i=0;
        System.out.println(check(arr,i,x));
    }
    public static boolean check(int[] arr,int i,int x) {
        if(i==x-1)
            return true;
        boolean ans=false;
        if(arr[i]<=arr[i+1])
            ans=check(arr,i+1,x);
        return ans;

    }
}
