package Recursion.Strings;

public class Permutation {

    public static void main(String[] args) {
        permu("abc","");

    }
    public static void permu(String up,String p)
    {
        if(up.length()==0)
        {
            System.out.println(p);
            return;
        }

        for (int i=0;i<up.length();i++)
        {
            char ch=up.charAt(i);
            String newUp=up.substring(0,i)+up.substring(i+1);
            permu(newUp,p+ch);

        }
    }



}
