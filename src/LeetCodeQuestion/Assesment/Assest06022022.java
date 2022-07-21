package LeetCodeQuestion.Assesment;

import java.util.Arrays;

public class Assest06022022 {
    public static void main(String[] args) {

    }
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length!=arr.length)
            return false;
//        int j=0;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=target[i])
                return false;
        }
        return true;

    }
}
