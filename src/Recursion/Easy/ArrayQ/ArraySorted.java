package Recursion.Easy.ArrayQ;

public class ArraySorted {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,10,6,7,8,9};
        System.out.println(sort(arr,0));

    }
    public static boolean sort(int [] arr, int index)
    {
        if(arr.length-1==index)
            return true;
        return (arr[index]<arr[index+1])&&sort(arr,index+1);
    }
}
