package Recursion.Strings;

public class ReversePrintString {
    public static void main(String[] args) {
        String str="abcd";
        reverse(str,0);

    }
    public static void reverse(String str,int index)
    {
        if(index==str.length())
        {
//            System.out.println(str.charAt(index));
            return;
        }

        char ch=str.charAt(index);
        reverse(str,index+1);
        System.out.println(ch);
    }
}
