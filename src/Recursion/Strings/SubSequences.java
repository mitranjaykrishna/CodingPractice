package Recursion.Strings;

public class SubSequences {
    public static void main(String[] args) {
        subsequences("abc","",0);

    }
    public static void subsequences(String str,String p,int index)
    {
        if (index==str.length())
        {
            System.out.println(p);
            return;
        }


        char ch=str.charAt(index);
        subsequences(str,p+ch,index+1);
        subsequences(str,p,index+1);
    }
}
