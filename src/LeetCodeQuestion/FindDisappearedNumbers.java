package LeetCodeQuestion;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Google

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int [] arr={1,2};
        System.out.println(findDisappearedNumbers(arr));

    }

    static public List<Integer> findDisappearedNumbers(int[] arr) {
        int j = 0;
        List<Integer> list = new ArrayList<Integer>();

        while (j < arr.length) {
            int correct = arr[j]-1;
            if (arr[j] <= arr.length && arr[j] != arr[correct]){
                int temp = arr[j];
                arr[j] = arr[correct];
                arr[correct] = temp;
            } else
                j++;



        }
        //search
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - 1) != i) {
                list.add(i + 1);
            }

        }
        // case 2
        return list;
    }
}
