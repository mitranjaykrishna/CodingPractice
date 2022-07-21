package Recursion.Strings;

import java.util.HashSet;

public class UniqueSusequences {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        uniqueSubsequence("aaab","",0,set);

    }

    public static void uniqueSubsequence(String str,String p,int index,HashSet<String> set)
    {
        if(index==str.length())
        {
            if(set.contains(p))
            {
                return;
            }
            System.out.println(p);
            set.add(p);
            return;
        }

        uniqueSubsequence(str,p+str.charAt(index),index+1,set);

        uniqueSubsequence(str,p,index+1,set);


    }
}
