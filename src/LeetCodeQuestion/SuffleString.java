package LeetCodeQuestion;
//https://leetcode.com/problems/shuffle-string/

public class SuffleString {
    public static void main(String[] args) {
        String a=restoreString("aiohn",new int[]{3,1,4,2,0});

        System.out.println(a);
    }

    public static String restoreString(String s, int[] indices) {
        int j=0;
        while (j<indices.length)
        {
            int correct=indices[j];
            if(indices[j]!=indices[correct])
            {

            }
            else
                j++;
        }
        return s;


    }
}
