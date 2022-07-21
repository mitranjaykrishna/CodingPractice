package Recursion.Strings;

public class SubSet {
    public static void main(String[] args) {
        String up="abc";
        subSet("",up);

    }
    public static void subSet(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+", ");
            return;
        }

        subSet(p+up.charAt(0),up.substring(1));
        subSet(p,up.substring(1));
    }
}
