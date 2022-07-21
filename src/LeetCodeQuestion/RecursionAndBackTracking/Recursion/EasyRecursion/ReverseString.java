package LeetCodeQuestion.RecursionAndBackTracking.Recursion.EasyRecursion;
//https://leetcode.com/problems/reverse-string/

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }

    public static void reverseString(char[] s) {
        reverse(s,0,s.length-1);

    }
    public static void reverse(char[] s,int st,int e)
    {
        if(st>s.length-1)
            return;
        char ch=s[st];
        reverse(s,st+1,e-1);
        s[e]=ch;

    }

}
