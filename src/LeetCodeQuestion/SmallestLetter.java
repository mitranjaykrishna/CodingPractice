package LeetCodeQuestion;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    private static int s;

    public static void main(String[] args) {
        char[] letter={'c','f','j'};
        System.out.println(ceiling(letter,'j'));

    }
    static char ceiling(char[] letters, char target)
    {
        
        int s= 0;
        int e= letters.length-1;
        int m=-1;

        while(s<=e)
        {
            m=s+(e-s)/2;

            if(target<letters[m])
            {
                e=m-1;

            }
            else

                {
                    s=m+1;
                }

        }
        return letters[s% letters.length] ;
    }
}
