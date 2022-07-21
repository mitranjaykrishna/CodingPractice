package Recursion.Easy.ArrayQ;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,4,7,8,9};
        System.out.println(linearSearchWithRecurrence(arr,0,0));
        System.out.println(linearSearchFindingFirstAndLast(arr,4,0));

    }
    public static boolean linearSearchWithRecurrence(int [] arr, int target, int i)
    {
        if(i>=arr.length)
            return false;
        return (arr[i]==target)|| linearSearchWithRecurrence(arr,target,i+1);
    }
    //index value from start
    public static int linearSearchWithRecurrenceStart(int [] arr, int target, int i)
    {
        if(i>=arr.length)
            return -1;
        if(arr[i]==target)
            return i;
        else
            return linearSearchWithRecurrenceStart(arr,target,i+1);
    }

    //index value from Last
    public static int linearSearchWithRecurrenceLast(int [] arr, int target, int i)
    {
        if(i==-1)
            return -1;
        if(arr[i]==target)
            return i;
        else
            return linearSearchWithRecurrenceLast(arr,target,i-1);
    }

    //Imported Approach for finding Start And End index of Target

    public static ArrayList<Integer> linearSearchFindingFirstAndLast(int [] arr,int target,int i)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==i)
            return list;

        if(arr[i]==target)
            list.add(i);

        ArrayList<Integer> re=linearSearchFindingFirstAndLast(arr,target,i+1);
        if(!re.isEmpty())
        {
            list.addAll(re);
        }
        return list;
    }


}
